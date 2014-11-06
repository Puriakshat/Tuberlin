package org.omg.CosNotifyChannelAdminAck;

/**
 * Generated from IDL interface "SequenceProxyPushSupplierAck".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class SequenceProxyPushSupplierAckHolder	implements org.omg.CORBA.portable.Streamable{
	 public SequenceProxyPushSupplierAck value;
	public SequenceProxyPushSupplierAckHolder()
	{
	}
	public SequenceProxyPushSupplierAckHolder (final SequenceProxyPushSupplierAck initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return SequenceProxyPushSupplierAckHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SequenceProxyPushSupplierAckHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		SequenceProxyPushSupplierAckHelper.write (_out,value);
	}
}
