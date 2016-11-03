package TxnManager.Group;

import org.jpos.core.Configuration;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.ISOSource;
import org.jpos.transaction.Context;
import org.jpos.transaction.TxnSupport;

import java.io.Serializable;


import static Utils.constants.*;
import static Utils.constants.TRXSPC.*;

/**
 * Created by arisimam on 7/25/15.
 */
public class NotSupport extends TxnSupport {

    private Configuration cfgM;

    protected int doPrepare(long id, Context ctx) throws Exception
    {
        cfgM= (Configuration) ctx.get(CONFIGMOTHER);
        ISOMsg message = (ISOMsg) ctx.get(REQUEST);
        ISOSource source = (ISOSource) ctx.get(SOURCE);
        message.setResponseMTI();

        message.set(39, "98");


        source.send(message);
        return PREPARED | NO_JOIN | READONLY;
    }
    @Override
    public void commit(long id, Serializable context) {

    }

    @Override
    public void abort(long id, Serializable context) {

    }
}