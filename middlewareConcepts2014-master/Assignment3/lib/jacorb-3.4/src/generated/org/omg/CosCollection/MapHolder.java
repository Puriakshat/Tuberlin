package org.omg.CosCollection;

/**
 * Generated from IDL interface "Map".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class MapHolder	implements org.omg.CORBA.portable.Streamable{
	 public Map value;
	public MapHolder()
	{
	}
	public MapHolder (final Map initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return MapHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = MapHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		MapHelper.write (_out,value);
	}
}
