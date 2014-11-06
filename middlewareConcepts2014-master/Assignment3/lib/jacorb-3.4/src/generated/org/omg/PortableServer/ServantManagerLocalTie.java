package org.omg.PortableServer;


/**
 * Generated from IDL interface "ServantManager".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class ServantManagerLocalTie
	extends _ServantManagerLocalBase
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private ServantManagerOperations _delegate;

	public ServantManagerLocalTie(ServantManagerOperations delegate)
	{
		_delegate = delegate;
	}
	public ServantManagerOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ServantManagerOperations delegate)
	{
		_delegate = delegate;
	}
}
