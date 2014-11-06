package org.omg.CosNotifyComm;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "SequencePullConsumer".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class SequencePullConsumerPOATie
	extends SequencePullConsumerPOA
{
	private SequencePullConsumerOperations _delegate;

	private POA _poa;
	public SequencePullConsumerPOATie(SequencePullConsumerOperations delegate)
	{
		_delegate = delegate;
	}
	public SequencePullConsumerPOATie(SequencePullConsumerOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosNotifyComm.SequencePullConsumer _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CosNotifyComm.SequencePullConsumer __r = org.omg.CosNotifyComm.SequencePullConsumerHelper.narrow(__o);
		return __r;
	}
	public org.omg.CosNotifyComm.SequencePullConsumer _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CosNotifyComm.SequencePullConsumer __r = org.omg.CosNotifyComm.SequencePullConsumerHelper.narrow(__o);
		return __r;
	}
	public SequencePullConsumerOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(SequencePullConsumerOperations delegate)
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
	public void disconnect_sequence_pull_consumer()
	{
_delegate.disconnect_sequence_pull_consumer();
	}

	public void offer_change(org.omg.CosNotification.EventType[] added, org.omg.CosNotification.EventType[] removed) throws org.omg.CosNotifyComm.InvalidEventType
	{
_delegate.offer_change(added,removed);
	}

}
