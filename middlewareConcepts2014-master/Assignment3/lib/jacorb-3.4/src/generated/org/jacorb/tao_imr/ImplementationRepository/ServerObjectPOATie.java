package org.jacorb.tao_imr.ImplementationRepository;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "ServerObject".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class ServerObjectPOATie
	extends ServerObjectPOA
{
	private ServerObjectOperations _delegate;

	private POA _poa;
	public ServerObjectPOATie(ServerObjectOperations delegate)
	{
		_delegate = delegate;
	}
	public ServerObjectPOATie(ServerObjectOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.jacorb.tao_imr.ImplementationRepository.ServerObject _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.jacorb.tao_imr.ImplementationRepository.ServerObject __r = org.jacorb.tao_imr.ImplementationRepository.ServerObjectHelper.narrow(__o);
		return __r;
	}
	public org.jacorb.tao_imr.ImplementationRepository.ServerObject _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.jacorb.tao_imr.ImplementationRepository.ServerObject __r = org.jacorb.tao_imr.ImplementationRepository.ServerObjectHelper.narrow(__o);
		return __r;
	}
	public ServerObjectOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ServerObjectOperations delegate)
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
	public void ping()
	{
_delegate.ping();
	}

	public void shutdown()
	{
_delegate.shutdown();
	}

}
