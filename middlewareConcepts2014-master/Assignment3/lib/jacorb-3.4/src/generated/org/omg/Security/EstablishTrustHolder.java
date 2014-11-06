package org.omg.Security;

/**
 * Generated from IDL struct "EstablishTrust".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class EstablishTrustHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.Security.EstablishTrust value;

	public EstablishTrustHolder ()
	{
	}
	public EstablishTrustHolder(final org.omg.Security.EstablishTrust initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.Security.EstablishTrustHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.Security.EstablishTrustHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.Security.EstablishTrustHelper.write(_out, value);
	}
}
