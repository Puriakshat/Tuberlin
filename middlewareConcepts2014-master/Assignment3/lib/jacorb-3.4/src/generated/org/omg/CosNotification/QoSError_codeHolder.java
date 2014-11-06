package org.omg.CosNotification;
/**
 * Generated from IDL enum "QoSError_code".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class QoSError_codeHolder
	implements org.omg.CORBA.portable.Streamable
{
	public QoSError_code value;

	public QoSError_codeHolder ()
	{
	}
	public QoSError_codeHolder (final QoSError_code initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return QoSError_codeHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = QoSError_codeHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		QoSError_codeHelper.write (out,value);
	}
}
