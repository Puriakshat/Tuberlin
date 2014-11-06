package org.omg.CosNotifyComm;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "PullConsumer".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class PullConsumerPOATie
	extends PullConsumerPOA
{
	private PullConsumerOperations _delegate;

	private POA _poa;
	public PullConsumerPOATie(PullConsumerOperations delegate)
	{
		_delegate = delegate;
	}
	public PullConsumerPOATie(PullConsumerOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosNotifyComm.PullConsumer _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CosNotifyComm.PullConsumer __r = org.omg.CosNotifyComm.PullConsumerHelper.narrow(__o);
		return __r;
	}
	public org.omg.CosNotifyComm.PullConsumer _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CosNotifyComm.PullConsumer __r = org.omg.CosNotifyComm.PullConsumerHelper.narrow(__o);
		return __r;
	}
	public PullConsumerOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(PullConsumerOperations delegate)
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

	public void offer_change(org.omg.CosNotification.EventType[] added, org.omg.CosNotification.EventType[] removed) throws org.omg.CosNotifyComm.InvalidEventType
	{
_delegate.offer_change(added,removed);
	}

}
