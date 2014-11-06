package org.jacorb.test.listenendpoints.echo_corbaloc;

import java.net.InetAddress;

public class EchoMessageImpl
    extends EchoMessagePOA
{
    private String location = "";

    public EchoMessageImpl(String location)
    {
        this.location = location;
    }

    public void ping()
    {
        return;
    }

    public String echo_simple()
    {

        try
        {
            String hostname =  InetAddress.getLocalHost().toString();
            String resp = new String("Simple greeting from " + location
                    + " (" + InetAddress.getLocalHost().toString() + ")");
            // System.out.println("EchoMessageImpl: echo_simple: send: <" + resp + ">");
            return resp;
        }
        catch (Exception e)
        {
            // ignore unknown host exception
        }

        return new String("Simple greeting from " + location);
    }

    public String echo_string(String wide_msg)
    {
        String resp = new String (wide_msg);
        //System.out.println("EchoMessageImpl: echo_string: receive: <" + resp + ">");
        //System.out.flush();
        return resp;
    }

    public String echo_wide(String wide_msg)
    {
        String resp = new String (wide_msg);
        //System.out.println("EchoMessageImpl: echo_wide: receive: <" + resp + ">");
        //System.out.flush();
        return resp;
    }
}
