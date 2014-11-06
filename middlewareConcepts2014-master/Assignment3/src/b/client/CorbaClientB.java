package b.client;

import client.UI.ClientGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;
import javax.swing.JButton;
import org.omg.CORBA.*;
import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContext;
import org.omg.CosNaming.NamingContextHelper;
import org.omg.CosNaming.NamingContextPackage.CannotProceed;
import org.omg.CosNaming.NamingContextPackage.NotFound;

public class CorbaClientB {

    private static ClientGUI client;

    private void startCorbaCLient(String nameOrID) {

        Properties props = new Properties();
        props.setProperty("org.omg.CORBA.ORBInitialPort", "22010");
        props.setProperty("org.omg.CORBA.ORBInitialHost", "localhost");
        props.setProperty("ORBInitRef", "NameService=http://localhost/~dafarache/NS_Ref");
        ORB orb = ORB.init((String[]) null, props);

        try {

            org.omg.CORBA.Object ncRef = orb.resolve_initial_references("NameService");

            NamingContext nc = NamingContextHelper.narrow(ncRef);
            NameComponent nComp = new NameComponent("exerciseA", "");
            NameComponent[] path = {nComp};
            org.omg.CORBA.Object objRef = nc.resolve(path);

            NVList argList = orb.create_list(1);
            Any argument = orb.create_any();
            argument.insert_string(nameOrID);
            argList.add_value("stockName", argument, org.omg.CORBA.ARG_IN.value);

            // wrap it in a NamedValue 
            Any result = orb.create_any();
            result.insert_float((float) 0);
            NamedValue resultVal = orb.create_named_value("result", result, org.omg.CORBA.ARG_OUT.value);

            Request thisReq;
            if (nameOrID.substring(0, 2).equals("DE")) {
                thisReq = objRef._create_request(null, "getQuoteByID", argList, resultVal);
            }else{
                thisReq = objRef._create_request(null, "getQuoteByName", argList, resultVal);
            }
            thisReq.invoke();

            // Get the return value from the Request object and output results. 
            result = thisReq.result().value();
            client.getTextField().setText(String.valueOf( result.extract_float() ));
       

        } catch (InvalidName ex) {
            System.err.println(ex);
        } catch (NotFound | CannotProceed | org.omg.CosNaming.NamingContextPackage.InvalidName ex) {
            System.err.println(ex);
        }
    }

    public void initializeClient() {
        client = new ClientGUI();
        client.setVisible(true);

        JButton textButton = client.getButton();
        textButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nameOrID = client.getDestinationField().getText();
                startCorbaCLient(nameOrID);
            }
        });
    }
}
