package org.omg.CosNotifyComm;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "NotifySubscribe".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class NotifySubscribePOATie
	extends NotifySubscribePOA
{
	private NotifySubscribeOperations _delegate;

	private POA _poa;
	public NotifySubscribePOATie(NotifySubscribeOperations delegate)
	{
		_delegate = delegate;
	}
	public NotifySubscribePOATie(NotifySubscribeOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosNotifyComm.NotifySubscribe _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CosNotifyComm.NotifySubscribe __r = org.omg.CosNotifyComm.NotifySubscribeHelper.narrow(__o);
		return __r;
	}
	public org.omg.CosNotifyComm.NotifySubscribe _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CosNotifyComm.NotifySubscribe __r = org.omg.CosNotifyComm.NotifySubscribeHelper.narrow(__o);
		return __r;
	}
	public NotifySubscribeOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(NotifySubscribeOperations delegate)
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
	public void subscription_change(org.omg.CosNotification.EventType[] added, org.omg.CosNotification.EventType[] removed) throws org.omg.CosNotifyComm.InvalidEventType
	{
_delegate.subscription_change(added,removed);
	}

}
