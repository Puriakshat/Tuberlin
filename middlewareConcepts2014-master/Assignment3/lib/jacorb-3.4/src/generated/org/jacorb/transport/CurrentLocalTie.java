package org.jacorb.transport;


/**
 * Generated from IDL interface "Current".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:53
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
	public long messages_received() throws org.jacorb.transport.NoContext
	{
		return _delegate.messages_received();
	}

	public long bytes_received() throws org.jacorb.transport.NoContext
	{
		return _delegate.bytes_received();
	}

	public long bytes_sent() throws org.jacorb.transport.NoContext
	{
		return _delegate.bytes_sent();
	}

	public int id() throws org.jacorb.transport.NoContext
	{
		return _delegate.id();
	}

	public long messages_sent() throws org.jacorb.transport.NoContext
	{
		return _delegate.messages_sent();
	}

	public long open_since() throws org.jacorb.transport.NoContext
	{
		return _delegate.open_since();
	}

}
