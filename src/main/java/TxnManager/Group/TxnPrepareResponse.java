package TxnManager.Group;

import org.jpos.iso.ISOMsg;
import org.jpos.transaction.Context;
import org.jpos.transaction.TxnSupport;

import java.io.PrintStream;
import java.io.Serializable;

import Utils.util;
import static Utils.constants.*;
import static Utils.constants.TRXSPC.*;

/**
 * Created by arisimam on 7/26/15.
 */
public class TxnPrepareResponse extends TxnSupport  {
  //  String Error;

    protected int doPrepare(long id, Context ctx)
    {
        warn("TxnPrepareResponse");
         PrintStream ps = new PrintStream(System.out);
     ctx.dump(ps,"TxnPrepareResponse");
        ISOMsg message = (ISOMsg) ctx.get(REQUEST);
        String  ErrorStep=(String) ctx.get(ERRORSTEP);



        warn(" "+"ErrorStep ="+ ErrorStep);
         try {

             message.set(12, util.getCurrentDate("HHmmss"));
             message.set(13, util.getCurrentDate("MMdd"));
             message.set(39, ErrorStep);


             ctx.put(RESPONSE, message);
             message.setResponseMTI();


         } catch (Exception e)
        {

            return  PREPARED | NO_JOIN | READONLY;
        }



        return PREPARED | NO_JOIN | READONLY;
    }
    @Override
    public void commit(long id, Serializable context) {


    }
    @Override
    public void abort(long id, Serializable context) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

}
