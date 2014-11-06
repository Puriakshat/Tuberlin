package org.omg.CosNotifyChannelAdmin;

/**
 * Generated from IDL interface "SequenceProxyPushSupplier".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class SequenceProxyPushSupplierHolder	implements org.omg.CORBA.portable.Streamable{
	 public SequenceProxyPushSupplier value;
	public SequenceProxyPushSupplierHolder()
	{
	}
	public SequenceProxyPushSupplierHolder (final SequenceProxyPushSupplier initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return SequenceProxyPushSupplierHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SequenceProxyPushSupplierHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		SequenceProxyPushSupplierHelper.write (_out,value);
	}
}
