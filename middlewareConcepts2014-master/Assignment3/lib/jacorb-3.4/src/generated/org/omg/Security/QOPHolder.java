package org.omg.Security;
/**
 * Generated from IDL enum "QOP".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class QOPHolder
	implements org.omg.CORBA.portable.Streamable
{
	public QOP value;

	public QOPHolder ()
	{
	}
	public QOPHolder (final QOP initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return QOPHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = QOPHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		QOPHelper.write (out,value);
	}
}
