package App;

import org.jpos.transaction.GroupSelector;

import java.io.Serializable;

/**
 * Created by dimo on 4/14/16.
 */
public class GateAppUtils extends GateSupport implements GroupSelector {


    @Override
    public String select(long id, Serializable context) {

        return null;
    }
    // @Override
    public int prepare(long id, Serializable context) {

        return PREPARED;  //To change body of implemented methods use File | Settings | File Templates.
    }

    // @Override
    public void commit(long id, Serializable context) {

        //To change body of implemented methods use File | Settings | File Templates.
    }

    // @Override
    public void abort(long id, Serializable context) {

        //To change body of implemented methods use File | Settings | File Templates.
    }
}