package org.omg.PortableInterceptor;


/**
 * Generated from IDL interface "PolicyFactory".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class PolicyFactoryLocalTie
	extends _PolicyFactoryLocalBase
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private PolicyFactoryOperations _delegate;

	public PolicyFactoryLocalTie(PolicyFactoryOperations delegate)
	{
		_delegate = delegate;
	}
	public PolicyFactoryOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(PolicyFactoryOperations delegate)
	{
		_delegate = delegate;
	}
	public org.omg.CORBA.Policy create_policy(int type, org.omg.CORBA.Any value) throws org.omg.CORBA.PolicyError
	{
		return _delegate.create_policy(type,value);
	}

}
