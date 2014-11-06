package org.omg.PortableServer;

/**
 * Generated from IDL interface "IdUniquenessPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class IdUniquenessPolicyHolder	implements org.omg.CORBA.portable.Streamable{
	 public IdUniquenessPolicy value;
	public IdUniquenessPolicyHolder()
	{
	}
	public IdUniquenessPolicyHolder (final IdUniquenessPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return IdUniquenessPolicyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = IdUniquenessPolicyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		IdUniquenessPolicyHelper.write (_out,value);
	}
}
