package App;

import org.jpos.core.Configurable;
import org.jpos.core.Configuration;
import org.jpos.core.ConfigurationException;
import org.jpos.iso.ISOException;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.ISORequestListener;
import org.jpos.iso.ISOSource;
import org.jpos.util.Log;
import org.jpos.util.LogEvent;
import org.jpos.util.LogSource;
import org.jpos.util.Logger;
import org.jpos.util.Profiler;

/**
 * Created by san on 11/3/16.
 */
public class GateApp extends Log implements ISORequestListener,Configurable {
    private Configuration cfg;
    private String className;

    @Override
    public void setConfiguration(Configuration cfg) throws ConfigurationException {
        this.cfg = cfg;
    }

    @Override
    public boolean process(ISOSource source, ISOMsg m) {

        Profiler prof = new Profiler();
        LogEvent evt = new LogEvent(this, "any-Transaction", prof);
        try {

            className = cfg.get("prefix", "App.GateApp");

            Class c = Class.forName(className);
            if (c != null) {
                ISORequestListener rl = (ISORequestListener) c.newInstance();
                if (rl instanceof LogSource)
                    ((LogSource) rl).setLogger
                            (getLogger(), getRealm() + "-" + m.getMTI() + "-" + m.getString(3));
                if (rl instanceof Configurable)
                    ((Configurable) rl).setConfiguration(cfg);
                return rl.process(source, m);
            }
        } catch (ClassNotFoundException e) {
            warn(e.getClass().getName() + " " + e.getMessage());
            evt.addMessage("ClassNotFoundException  Found");
        } catch (InstantiationException e) {
            warn(e);
            evt.addMessage("InstantiationException class  Found");
        } catch (IllegalAccessException e) {
            warn(e);
        } catch (ISOException e) {
            warn(e);
            evt.addMessage("ISOException class  Found");
        }
        Logger.log(evt);
        return false;
    }
}