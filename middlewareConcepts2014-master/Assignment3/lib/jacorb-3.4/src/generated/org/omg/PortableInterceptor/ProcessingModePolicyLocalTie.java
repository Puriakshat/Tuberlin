package org.omg.PortableInterceptor;


/**
 * Generated from IDL interface "ProcessingModePolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class ProcessingModePolicyLocalTie
	extends _ProcessingModePolicyLocalBase
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private ProcessingModePolicyOperations _delegate;

	public ProcessingModePolicyLocalTie(ProcessingModePolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public ProcessingModePolicyOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ProcessingModePolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public short processing_mode()
	{
		return _delegate.processing_mode();
	}

	public int policy_type()
	{
		return _delegate.policy_type();
	}

	public org.omg.CORBA.Policy copy()
	{
		return _delegate.copy();
	}

	public void destroy()
	{
_delegate.destroy();
	}

}
