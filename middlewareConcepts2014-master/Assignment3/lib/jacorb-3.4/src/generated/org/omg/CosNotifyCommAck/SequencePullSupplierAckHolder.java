package org.omg.CosNotifyCommAck;

/**
 * Generated from IDL interface "SequencePullSupplierAck".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class SequencePullSupplierAckHolder	implements org.omg.CORBA.portable.Streamable{
	 public SequencePullSupplierAck value;
	public SequencePullSupplierAckHolder()
	{
	}
	public SequencePullSupplierAckHolder (final SequencePullSupplierAck initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return SequencePullSupplierAckHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SequencePullSupplierAckHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		SequencePullSupplierAckHelper.write (_out,value);
	}
}
