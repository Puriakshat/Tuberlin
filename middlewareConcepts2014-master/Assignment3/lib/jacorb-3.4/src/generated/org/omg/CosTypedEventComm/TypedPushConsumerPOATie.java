package org.omg.CosTypedEventComm;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "TypedPushConsumer".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class TypedPushConsumerPOATie
	extends TypedPushConsumerPOA
{
	private TypedPushConsumerOperations _delegate;

	private POA _poa;
	public TypedPushConsumerPOATie(TypedPushConsumerOperations delegate)
	{
		_delegate = delegate;
	}
	public TypedPushConsumerPOATie(TypedPushConsumerOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosTypedEventComm.TypedPushConsumer _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CosTypedEventComm.TypedPushConsumer __r = org.omg.CosTypedEventComm.TypedPushConsumerHelper.narrow(__o);
		return __r;
	}
	public org.omg.CosTypedEventComm.TypedPushConsumer _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CosTypedEventComm.TypedPushConsumer __r = org.omg.CosTypedEventComm.TypedPushConsumerHelper.narrow(__o);
		return __r;
	}
	public TypedPushConsumerOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TypedPushConsumerOperations delegate)
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

	public void disconnect_push_consumer()
	{
_delegate.disconnect_push_consumer();
	}

	public void push(org.omg.CORBA.Any data) throws org.omg.CosEventComm.Disconnected
	{
_delegate.push(data);
	}

}
