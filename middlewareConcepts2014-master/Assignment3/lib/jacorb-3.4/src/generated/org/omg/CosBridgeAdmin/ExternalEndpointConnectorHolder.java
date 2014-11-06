package org.omg.CosBridgeAdmin;
/**
 * Generated from IDL union "ExternalEndpointConnector".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ExternalEndpointConnectorHolder
	implements org.omg.CORBA.portable.Streamable
{
	public ExternalEndpointConnector value;

	public ExternalEndpointConnectorHolder ()
	{
	}
	public ExternalEndpointConnectorHolder (final ExternalEndpointConnector initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ExternalEndpointConnectorHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ExternalEndpointConnectorHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ExternalEndpointConnectorHelper.write (out, value);
	}
}
