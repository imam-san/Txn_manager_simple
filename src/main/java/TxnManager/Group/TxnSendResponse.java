package TxnManager.Group;

import org.jpos.iso.ISOMsg;
import org.jpos.iso.ISOSource;
import org.jpos.transaction.Context;
import org.jpos.transaction.TxnSupport;

import java.io.PrintStream;
import java.io.Serializable;


import static Utils.constants.*;
import static Utils.constants.TRXSPC.*;
/**
 * Created by arisimam on 7/26/15.
 */
public class TxnSendResponse extends TxnSupport {

    protected int doPrepare(long id, Context ctx) throws Exception
    {
               PrintStream ps = new PrintStream(System.out);
     ctx.dump(ps,"TxnSendResponse");

        ISOMsg message = (ISOMsg) ctx.get((RESPONSE));
        ISOSource source = (ISOSource) ctx.get(SOURCE);

        source.send (message);
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
