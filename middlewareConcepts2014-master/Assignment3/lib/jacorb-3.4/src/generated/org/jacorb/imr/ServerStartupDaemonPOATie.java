package org.jacorb.imr;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "ServerStartupDaemon".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class ServerStartupDaemonPOATie
	extends ServerStartupDaemonPOA
{
	private ServerStartupDaemonOperations _delegate;

	private POA _poa;
	public ServerStartupDaemonPOATie(ServerStartupDaemonOperations delegate)
	{
		_delegate = delegate;
	}
	public ServerStartupDaemonPOATie(ServerStartupDaemonOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.jacorb.imr.ServerStartupDaemon _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.jacorb.imr.ServerStartupDaemon __r = org.jacorb.imr.ServerStartupDaemonHelper.narrow(__o);
		return __r;
	}
	public org.jacorb.imr.ServerStartupDaemon _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.jacorb.imr.ServerStartupDaemon __r = org.jacorb.imr.ServerStartupDaemonHelper.narrow(__o);
		return __r;
	}
	public ServerStartupDaemonOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ServerStartupDaemonOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		return super._default_POA();
	}
	public int get_system_load()
	{
		return _delegate.get_system_load();
	}

	public void start_server(java.lang.String command) throws org.jacorb.imr.ServerStartupFailed
	{
_delegate.start_server(command);
	}

}
