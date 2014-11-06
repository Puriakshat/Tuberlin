package org.jacorb.util.tracing;

/**
 * Generated from IDL struct "TraceData".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:53
 */

public final class TraceDataHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.jacorb.util.tracing.TraceData value;

	public TraceDataHolder ()
	{
	}
	public TraceDataHolder(final org.jacorb.util.tracing.TraceData initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.jacorb.util.tracing.TraceDataHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.jacorb.util.tracing.TraceDataHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.jacorb.util.tracing.TraceDataHelper.write(_out, value);
	}
}
