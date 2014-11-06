package org.omg.SecurityLevel2;

/**
 * Generated from IDL interface "QOPPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class QOPPolicyHolder	implements org.omg.CORBA.portable.Streamable{
	 public QOPPolicy value;
	public QOPPolicyHolder()
	{
	}
	public QOPPolicyHolder (final QOPPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return QOPPolicyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = QOPPolicyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		QOPPolicyHelper.write (_out,value);
	}
}
