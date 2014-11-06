package org.omg.CosCollection;

/**
 * Generated from IDL interface "RestrictedAccessCollection".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class RestrictedAccessCollectionHolder	implements org.omg.CORBA.portable.Streamable{
	 public RestrictedAccessCollection value;
	public RestrictedAccessCollectionHolder()
	{
	}
	public RestrictedAccessCollectionHolder (final RestrictedAccessCollection initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return RestrictedAccessCollectionHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RestrictedAccessCollectionHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		RestrictedAccessCollectionHelper.write (_out,value);
	}
}
