package org.jacorb.tao_imr.ImplementationRepository;

/**
 * Generated from IDL interface "AsyncStartupWaiter".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class AsyncStartupWaiterHolder	implements org.omg.CORBA.portable.Streamable{
	 public AsyncStartupWaiter value;
	public AsyncStartupWaiterHolder()
	{
	}
	public AsyncStartupWaiterHolder (final AsyncStartupWaiter initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return AsyncStartupWaiterHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AsyncStartupWaiterHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		AsyncStartupWaiterHelper.write (_out,value);
	}
}
