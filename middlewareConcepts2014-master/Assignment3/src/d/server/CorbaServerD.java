package d.server;

import StockExchangeD.Quoter;
import StockExchangeD.QuoterHelper;
import java.util.Properties;
import org.omg.CORBA.ORB;
import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.CosNaming.NamingContextPackage.CannotProceed;
import org.omg.CosNaming.NamingContextPackage.NotFound;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;
import org.omg.PortableServer.POAManagerPackage.AdapterInactive;
import org.omg.PortableServer.POAPackage.ServantNotActive;
import org.omg.PortableServer.POAPackage.WrongPolicy;

public class CorbaServerD {

    public void startCorbaServer() {
        try {
            Properties props = new Properties();
            props.setProperty("org.omg.CORBA.ORBInitialPort", "22010");
            props.setProperty("org.omg.CORBA.ORBInitialHost", "localhost");
            props.setProperty("ORBInitRef", "NameService=http://localhost/~dafarache/NS_Ref");
            ORB orb = ORB.init((String[]) null, props);

            POA rootPOA = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            rootPOA.the_POAManager().activate();
            QuoterImpl servImpl = new QuoterImpl();

            org.omg.CORBA.Object ref = rootPOA.servant_to_reference(servImpl);
            Quoter servRef = QuoterHelper.narrow(ref);

            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            NameComponent[] path = {new NameComponent("exerciseD", "")};
            ncRef.rebind(path, servRef);
            
            orb.run();
        } catch (AdapterInactive | InvalidName | WrongPolicy | org.omg.CosNaming.NamingContextPackage.InvalidName | NotFound | CannotProceed | ServantNotActive ex) {
            System.err.println(ex);
        }
    }
}
