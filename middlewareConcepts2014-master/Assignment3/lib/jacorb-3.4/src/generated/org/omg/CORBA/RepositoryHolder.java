package org.omg.CORBA;

/**
 * Generated from IDL interface "Repository".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class RepositoryHolder	implements org.omg.CORBA.portable.Streamable{
	 public Repository value;
	public RepositoryHolder()
	{
	}
	public RepositoryHolder (final Repository initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return RepositoryHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RepositoryHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		RepositoryHelper.write (_out,value);
	}
}
