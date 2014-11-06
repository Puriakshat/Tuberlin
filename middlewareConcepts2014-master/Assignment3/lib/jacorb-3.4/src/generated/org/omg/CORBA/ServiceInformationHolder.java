package org.omg.CORBA;

/**
 * Generated from IDL struct "ServiceInformation".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ServiceInformationHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CORBA.ServiceInformation value;

	public ServiceInformationHolder ()
	{
	}
	public ServiceInformationHolder(final org.omg.CORBA.ServiceInformation initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CORBA.ServiceInformationHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CORBA.ServiceInformationHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CORBA.ServiceInformationHelper.write(_out, value);
	}
}
