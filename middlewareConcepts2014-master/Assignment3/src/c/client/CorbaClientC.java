package c.client;

import java.util.Properties;
import org.omg.CORBA.ORB;
import org.omg.CORBA.ORBPackage.InvalidName;
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

public class CorbaClientC {

    public static ServerCommunication servComm;


    public void startCorbaClient(String nameOrId) {
        try {
            // create and initialize the ORB
            Properties props = new Properties();
            props.setProperty("org.omg.CORBA.ORBInitialPort", "22010");
            props.setProperty("org.omg.CORBA.ORBInitialHost", "localhost");
            props.setProperty("ORBInitRef", "NameService=http://localhost/~dafarache/NS_Ref");
            ORB orb = ORB.init((String[]) null, props);

            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            System.out.println((ncRef.resolve_str("exerciseC")).getClass().toString());

            POA rootPOA = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            ResponderImpl responderImpl = new ResponderImpl();
            rootPOA.activate_object(responderImpl);
            Responder responder = ResponderHelper.narrow(rootPOA.servant_to_reference(responderImpl));

            rootPOA.the_POAManager().activate();

            servComm = ServerCommunicationHelper.narrow(ncRef.resolve_str("exerciseC"));
            servComm.register_callback(nameOrId, responder);

            System.out.println("I get here");

            orb.run();

        } catch (InvalidName | ServantAlreadyActive | WrongPolicy | ServantNotActive | NotFound | CannotProceed | org.omg.CosNaming.NamingContextPackage.InvalidName | AdapterInactive ex) {
            System.err.println(ex);
        }
    }

}
