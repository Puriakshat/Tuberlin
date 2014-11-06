package org.omg.PortableInterceptor;

/**
 * Generated from IDL interface "ProcessingModePolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ProcessingModePolicyHolder	implements org.omg.CORBA.portable.Streamable{
	 public ProcessingModePolicy value;
	public ProcessingModePolicyHolder()
	{
	}
	public ProcessingModePolicyHolder (final ProcessingModePolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ProcessingModePolicyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ProcessingModePolicyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ProcessingModePolicyHelper.write (_out,value);
	}
}
