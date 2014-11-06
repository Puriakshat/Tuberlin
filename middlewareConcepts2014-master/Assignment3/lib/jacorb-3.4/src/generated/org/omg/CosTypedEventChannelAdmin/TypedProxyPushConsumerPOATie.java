package org.omg.CosTypedEventChannelAdmin;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "TypedProxyPushConsumer".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class TypedProxyPushConsumerPOATie
	extends TypedProxyPushConsumerPOA
{
	private TypedProxyPushConsumerOperations _delegate;

	private POA _poa;
	public TypedProxyPushConsumerPOATie(TypedProxyPushConsumerOperations delegate)
	{
		_delegate = delegate;
	}
	public TypedProxyPushConsumerPOATie(TypedProxyPushConsumerOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosTypedEventChannelAdmin.TypedProxyPushConsumer _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CosTypedEventChannelAdmin.TypedProxyPushConsumer __r = org.omg.CosTypedEventChannelAdmin.TypedProxyPushConsumerHelper.narrow(__o);
		return __r;
	}
	public org.omg.CosTypedEventChannelAdmin.TypedProxyPushConsumer _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CosTypedEventChannelAdmin.TypedProxyPushConsumer __r = org.omg.CosTypedEventChannelAdmin.TypedProxyPushConsumerHelper.narrow(__o);
		return __r;
	}
	public TypedProxyPushConsumerOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TypedProxyPushConsumerOperations delegate)
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
	public org.omg.CORBA.Object get_typed_consumer()
	{
		return _delegate.get_typed_consumer();
	}

	public void connect_push_supplier(org.omg.CosEventComm.PushSupplier push_supplier) throws org.omg.CosEventChannelAdmin.AlreadyConnected
	{
_delegate.connect_push_supplier(push_supplier);
	}

	public void disconnect_push_consumer()
	{
_delegate.disconnect_push_consumer();
	}

	public void push(org.omg.CORBA.Any data) throws org.omg.CosEventComm.Disconnected
	{
_delegate.push(data);
	}

}
