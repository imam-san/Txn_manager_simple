package TxnManager;

import org.jpos.transaction.AbortParticipant;
import org.jpos.transaction.Context;
import org.jpos.transaction.TxnSupport;

import java.io.Serializable;

/**
 * Created by dimo on 9/14/15.
 */
public class TxnClose  extends TxnSupport implements AbortParticipant {

    // nah disini Close Dbny
    public int prepare (long id, Serializable o) {
        closeDB(o);

        return PREPARED | READONLY;
    }
    public int prepareForAbort (long id, Serializable o) {
        return PREPARED | READONLY;
    }
    public void commit (long id, Serializable o) {closehttp(o);
        closeDB(o);
    }
    public void abort  (long id, Serializable o) {closehttp(o);
        closeDB(o);
    }

    private void closehttp(Serializable o)
     {
      Context ctx = (Context) o;

          checkPoint(ctx);

   }
    private void closeDB (Serializable o) {
        Context ctx = (Context) o;


        checkPoint(ctx);
    }
}
