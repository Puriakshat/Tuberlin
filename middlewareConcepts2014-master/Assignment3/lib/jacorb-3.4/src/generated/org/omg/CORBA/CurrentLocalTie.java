package org.omg.CORBA;


/**
 * Generated from IDL interface "Current".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class CurrentLocalTie
	extends _CurrentLocalBase
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private CurrentOperations _delegate;

	public CurrentLocalTie(CurrentOperations delegate)
	{
		_delegate = delegate;
	}
	public CurrentOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(CurrentOperations delegate)
	{
		_delegate = delegate;
	}
}
