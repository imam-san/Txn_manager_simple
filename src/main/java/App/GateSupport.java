package App;

import org.jpos.core.Configurable;
import org.jpos.core.Configuration;
import org.jpos.core.ConfigurationException;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.ISORequestListener;
import org.jpos.iso.ISOSource;
import org.jpos.space.Space;
import org.jpos.space.SpaceFactory;
import org.jpos.transaction.Context;
import org.jpos.util.Log;

import static Utils.constants.*;
import static Utils.constants.TRXSPC.*;




/**
 * Created by arisimam on 7/25/15.
 */
public class GateSupport extends Log implements ISORequestListener,Configurable {

   private  Configuration cfg;
   private long timeout = 12000;
   private   Space sp;
    private  String queue;
     Context ctx;


private Configuration cfgM;
    private ISOSource source;
    private ISOMsg m;

    private String res_desc = "";
    private String defaultTip = "0";
    boolean loyaltyVersion = false;


    @Override
    public boolean process(ISOSource source, ISOMsg m) {
         ctx = new Context();

      

        ctx.put(REQUEST, m);
      warn("gate support");

        String txnname = m.getString(0).substring(1);
        if (m.hasField(3)) {
            String pcode = m.getString(3);
            txnname = txnname + "." + pcode;

        }  else  if (m.hasField(33)) {
            String pcode = m.getString(33);
            txnname = txnname + "." + pcode;

        }



        ctx.getString (TXNMGR);
        ctx.put(SPACE,sp);
        ctx.put(TXNCFG,queue);
        ctx.put(CONFIGMOTHER, cfg);
        ctx.put(TXNNAME, txnname);
        ctx.put(SOURCE, source);
        ctx.put(ERRORSTEP, RC_RESPONSE_TO_LATE);
        ctx.put(SAVE_LOG,"00");
        ctx.put(EERR_DESCR,"OK");
        ctx.put(IS_TIMEOUT_SIM,"0");
        sp.out(queue, ctx, timeout); // hands off to the TransactionManager
        return true;

    }
    @SuppressWarnings("unchecked")
    public void setConfiguration(Configuration cfg) throws ConfigurationException

    {

        this.cfg = cfg;
        this.timeout = cfg.getLong("timeout", timeout);
        this.sp = SpaceFactory.getSpace(cfg.get("space"));
        this.queue = cfg.get("queue", null);
        if (queue == null) {
            throw new ConfigurationException("queue property not specified");
        }

    }
}