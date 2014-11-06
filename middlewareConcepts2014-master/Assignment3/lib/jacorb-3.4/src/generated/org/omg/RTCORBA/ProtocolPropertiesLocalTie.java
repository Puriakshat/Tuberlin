package org.omg.RTCORBA;


/**
 * Generated from IDL interface "ProtocolProperties".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class ProtocolPropertiesLocalTie
	extends _ProtocolPropertiesLocalBase
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private ProtocolPropertiesOperations _delegate;

	public ProtocolPropertiesLocalTie(ProtocolPropertiesOperations delegate)
	{
		_delegate = delegate;
	}
	public ProtocolPropertiesOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ProtocolPropertiesOperations delegate)
	{
		_delegate = delegate;
	}
}
