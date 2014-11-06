package org.omg.CSI;
/**
 * Generated from IDL union "SASContextBody".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class SASContextBodyHolder
	implements org.omg.CORBA.portable.Streamable
{
	public SASContextBody value;

	public SASContextBodyHolder ()
	{
	}
	public SASContextBodyHolder (final SASContextBody initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SASContextBodyHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SASContextBodyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SASContextBodyHelper.write (out, value);
	}
}
