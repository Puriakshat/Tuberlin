package org.omg.CosNotifyChannelAdminAck;

/**
 * Generated from IDL interface "SequenceProxyPullSupplierAck".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class SequenceProxyPullSupplierAckHolder	implements org.omg.CORBA.portable.Streamable{
	 public SequenceProxyPullSupplierAck value;
	public SequenceProxyPullSupplierAckHolder()
	{
	}
	public SequenceProxyPullSupplierAckHolder (final SequenceProxyPullSupplierAck initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return SequenceProxyPullSupplierAckHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SequenceProxyPullSupplierAckHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		SequenceProxyPullSupplierAckHelper.write (_out,value);
	}
}
