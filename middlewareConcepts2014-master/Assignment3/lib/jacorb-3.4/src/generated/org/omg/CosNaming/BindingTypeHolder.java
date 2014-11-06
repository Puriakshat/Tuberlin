package org.omg.CosNaming;
/**
 * Generated from IDL enum "BindingType".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class BindingTypeHolder
	implements org.omg.CORBA.portable.Streamable
{
	public BindingType value;

	public BindingTypeHolder ()
	{
	}
	public BindingTypeHolder (final BindingType initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return BindingTypeHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = BindingTypeHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		BindingTypeHelper.write (out,value);
	}
}
