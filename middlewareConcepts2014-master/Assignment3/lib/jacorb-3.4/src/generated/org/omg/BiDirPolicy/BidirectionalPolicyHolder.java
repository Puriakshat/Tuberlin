package org.omg.BiDirPolicy;

/**
 * Generated from IDL interface "BidirectionalPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class BidirectionalPolicyHolder	implements org.omg.CORBA.portable.Streamable{
	 public BidirectionalPolicy value;
	public BidirectionalPolicyHolder()
	{
	}
	public BidirectionalPolicyHolder (final BidirectionalPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return BidirectionalPolicyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = BidirectionalPolicyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		BidirectionalPolicyHelper.write (_out,value);
	}
}
