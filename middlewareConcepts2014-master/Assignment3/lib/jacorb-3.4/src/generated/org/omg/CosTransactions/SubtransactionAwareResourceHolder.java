package org.omg.CosTransactions;

/**
 * Generated from IDL interface "SubtransactionAwareResource".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class SubtransactionAwareResourceHolder	implements org.omg.CORBA.portable.Streamable{
	 public SubtransactionAwareResource value;
	public SubtransactionAwareResourceHolder()
	{
	}
	public SubtransactionAwareResourceHolder (final SubtransactionAwareResource initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return SubtransactionAwareResourceHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SubtransactionAwareResourceHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		SubtransactionAwareResourceHelper.write (_out,value);
	}
}
