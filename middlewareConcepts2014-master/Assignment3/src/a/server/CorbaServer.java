package a.server;

import java.util.Properties;
import org.omg.CORBA.ORB;
import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.CosNaming.NamingContextPackage.CannotProceed;
import org.omg.CosNaming.NamingContextPackage.NotFound;
import org.omg.PortableServer.POAManagerPackage.AdapterInactive;
import org.omg.PortableServer.POAPackage.ServantNotActive;
import org.omg.PortableServer.POAPackage.WrongPolicy;

public class CorbaServer {

    public void startCorbaServer() {
        try {
            Properties props = new Properties();
            props.setProperty("org.omg.CORBA.ORBInitialPort", "22010");
            props.setProperty("org.omg.CORBA.ORBInitialHost", "localhost");
            props.setProperty("ORBInitRef", "NameService=http://localhost/~dafarache/NS_Ref");
            
            ORB orb = ORB.init((String[]) null, props);

            org.omg.PortableServer.POA objectAdapter
                    = org.omg.PortableServer.POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            objectAdapter.the_POAManager().activate();

            //call the servant object 
            QuoterImpl stockQuote = new QuoterImpl();
            
            org.omg.CORBA.Object ref = objectAdapter.servant_to_reference(stockQuote);
            Quoter qhelp = QuoterHelper.narrow(ref);
            
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            
            NamingContextExt nContext= NamingContextExtHelper.narrow(objRef);
            
            String name = "exerciseA";
            NameComponent path[] = nContext.to_name(name);
            nContext.rebind(path, qhelp);

            ////////////
            System.out.println("GET HERE");
            orb.run();

        } catch (InvalidName | AdapterInactive | ServantNotActive | WrongPolicy ex) {
            System.err.println(ex);
        } catch (org.omg.CosNaming.NamingContextPackage.InvalidName | NotFound | CannotProceed ex) {
            System.err.println(ex);
        }
    }

}
