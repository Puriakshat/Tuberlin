package org.omg.PortableServer.POAManagerFactoryPackage;

/**
 * Generated from IDL alias "POAManagerSeq".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class POAManagerSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.PortableServer.POAManager[] value;

	public POAManagerSeqHolder ()
	{
	}
	public POAManagerSeqHolder (final org.omg.PortableServer.POAManager[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return POAManagerSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = POAManagerSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		POAManagerSeqHelper.write (out,value);
	}
}
