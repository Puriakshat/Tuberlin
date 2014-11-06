package org.omg.CosNotifyChannelAdmin;
/**
 * Generated from IDL enum "InterFilterGroupOperator".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class InterFilterGroupOperatorHolder
	implements org.omg.CORBA.portable.Streamable
{
	public InterFilterGroupOperator value;

	public InterFilterGroupOperatorHolder ()
	{
	}
	public InterFilterGroupOperatorHolder (final InterFilterGroupOperator initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return InterFilterGroupOperatorHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = InterFilterGroupOperatorHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		InterFilterGroupOperatorHelper.write (out,value);
	}
}
