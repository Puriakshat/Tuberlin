package c.server;

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
import org.omg.PortableServer.POAPackage.ServantAlreadyActive;
import org.omg.PortableServer.POAPackage.ServantNotActive;
import org.omg.PortableServer.POAPackage.WrongPolicy;

public class CorbaServerC {

    public void startCorbaServer() {
        try {
            Properties props = new Properties();
            props.setProperty("org.omg.CORBA.ORBInitialPort", "22010");
            props.setProperty("org.omg.CORBA.ORBInitialHost", "localhost");
            props.setProperty("ORBInitRef", "NameService=http://localhost/~dafarache/NS_Ref");
            ORB orb = ORB.init((String[]) null, props);
            
            POA rootPOA = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            ServerCommunicationImpl servImpl = new ServerCommunicationImpl();
            rootPOA.activate_object(servImpl);
            rootPOA.the_POAManager().activate();
            
            org.omg.CORBA.Object ref = rootPOA.servant_to_reference(servImpl);
            ServerCommunication servRef = ServerCommunicationHelper.narrow(ref);

            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            NameComponent[] nc = {new NameComponent("exerciseC", "")};
            ncRef.rebind(nc, servRef);

            System.out.println("Waiting for client calls");
            orb.run();

        } catch (InvalidName | ServantAlreadyActive | WrongPolicy | ServantNotActive ex) {
            System.err.println(ex);
        } catch (NotFound | CannotProceed | org.omg.CosNaming.NamingContextPackage.InvalidName | AdapterInactive ex) {
            System.err.println(ex);
        }
    }
}
