package TxnManager;

import org.jpos.transaction.Context;
import org.jpos.transaction.GroupSelector;
import org.jpos.transaction.TxnSupport;

import java.io.Serializable;

import Utils.constants;

import static Utils.constants.*;
import static Utils.constants.TRXSPC.*;

/**
 * Created by arisimam on 7/25/15.
 */
public class TxnSwitch extends TxnSupport implements GroupSelector {


    public int  prepare (long id, Serializable context) {


        return PREPARED | READONLY | NO_JOIN;
    }
    public void commit   (long id, Serializable ser) { }
    public void abort    (long id, Serializable ser) {

    }

    public String select (long id, Serializable ser) {

        Context ctx = (Context) ser;

        String type   = (String) ctx.get (constants.TRXSPC.TXNNAME);
        String groups = null;
        if (type != null)
            groups = cfg.get (type, null);
        if (groups == null)
            groups = cfg.get ("unknown", "");

        ctx.put ("SWITCH", type + " (" + groups + ")");

        return groups;

    }
}
