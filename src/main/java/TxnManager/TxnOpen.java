package TxnManager;

import org.jpos.core.Configuration;
import org.jpos.core.ConfigurationException;
import org.jpos.transaction.Context;
import org.jpos.transaction.TxnSupport;

import java.io.Serializable;

import static Utils.constants.*;
import static Utils.constants.TRXSPC.*;
/**
 * Created by dimo on 9/14/15.
 */
public class TxnOpen extends TxnSupport {
    int timeout = 0;
   protected Configuration cfg;

// biasanya ini Open koneksi DB kalo mau Save susuatu
 // pake library
//'jposee-db-mysql', version: '2.0.3-SNAPSHOT'
 //'jposee-dbsupport', version: '2.0.3-SNAPSHOT'
   //


    public int prepare(long id, Serializable o) {
       int rc = PREPARED;
        Context ctx = (Context) o;
      //  openDB(ctx);


        return rc ;
    }

    public void commit(long id, Serializable o) {
    }

    public void abort(long id, Serializable o) {
    }

    public void setConfiguration(Configuration cfg) throws ConfigurationException {
        super.setConfiguration(cfg);
        this.timeout = cfg.getInt("timeout", 0);
        this.cfg=cfg;
    }
}