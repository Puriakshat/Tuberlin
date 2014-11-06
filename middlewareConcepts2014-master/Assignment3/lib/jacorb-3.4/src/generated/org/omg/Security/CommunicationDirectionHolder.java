package org.omg.Security;
/**
 * Generated from IDL enum "CommunicationDirection".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class CommunicationDirectionHolder
	implements org.omg.CORBA.portable.Streamable
{
	public CommunicationDirection value;

	public CommunicationDirectionHolder ()
	{
	}
	public CommunicationDirectionHolder (final CommunicationDirection initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return CommunicationDirectionHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CommunicationDirectionHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		CommunicationDirectionHelper.write (out,value);
	}
}
