package org.omg.CosCollection;

/**
 * Generated from IDL alias "ParameterList".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ParameterListHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosCollection.NVPair[] value;

	public ParameterListHolder ()
	{
	}
	public ParameterListHolder (final org.omg.CosCollection.NVPair[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ParameterListHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ParameterListHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ParameterListHelper.write (out,value);
	}
}
