package org.omg.CosNotification;

/**
 * Generated from IDL interface "QoSAdmin".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class QoSAdminHolder	implements org.omg.CORBA.portable.Streamable{
	 public QoSAdmin value;
	public QoSAdminHolder()
	{
	}
	public QoSAdminHolder (final QoSAdmin initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return QoSAdminHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = QoSAdminHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		QoSAdminHelper.write (_out,value);
	}
}
