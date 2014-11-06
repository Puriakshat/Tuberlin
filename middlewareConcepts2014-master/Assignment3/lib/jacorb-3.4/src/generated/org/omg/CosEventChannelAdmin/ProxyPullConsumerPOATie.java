package org.omg.CosEventChannelAdmin;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "ProxyPullConsumer".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class ProxyPullConsumerPOATie
	extends ProxyPullConsumerPOA
{
	private ProxyPullConsumerOperations _delegate;

	private POA _poa;
	public ProxyPullConsumerPOATie(ProxyPullConsumerOperations delegate)
	{
		_delegate = delegate;
	}
	public ProxyPullConsumerPOATie(ProxyPullConsumerOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosEventChannelAdmin.ProxyPullConsumer _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CosEventChannelAdmin.ProxyPullConsumer __r = org.omg.CosEventChannelAdmin.ProxyPullConsumerHelper.narrow(__o);
		return __r;
	}
	public org.omg.CosEventChannelAdmin.ProxyPullConsumer _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CosEventChannelAdmin.ProxyPullConsumer __r = org.omg.CosEventChannelAdmin.ProxyPullConsumerHelper.narrow(__o);
		return __r;
	}
	public ProxyPullConsumerOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ProxyPullConsumerOperations delegate)
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
	public void disconnect_pull_consumer()
	{
_delegate.disconnect_pull_consumer();
	}

	public void connect_pull_supplier(org.omg.CosEventComm.PullSupplier pull_supplier) throws org.omg.CosEventChannelAdmin.AlreadyConnected,org.omg.CosEventChannelAdmin.TypeError
	{
_delegate.connect_pull_supplier(pull_supplier);
	}

}
