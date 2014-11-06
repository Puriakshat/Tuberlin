package org.omg.dds;

/**
 * Generated from IDL interface "Entity".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class EntityHolder	implements org.omg.CORBA.portable.Streamable{
	 public Entity value;
	public EntityHolder()
	{
	}
	public EntityHolder (final Entity initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return EntityHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EntityHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		EntityHelper.write (_out,value);
	}
}
