package org.omg.CosNotifyComm;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "NotifyPublish".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class NotifyPublishPOATie
	extends NotifyPublishPOA
{
	private NotifyPublishOperations _delegate;

	private POA _poa;
	public NotifyPublishPOATie(NotifyPublishOperations delegate)
	{
		_delegate = delegate;
	}
	public NotifyPublishPOATie(NotifyPublishOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosNotifyComm.NotifyPublish _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CosNotifyComm.NotifyPublish __r = org.omg.CosNotifyComm.NotifyPublishHelper.narrow(__o);
		return __r;
	}
	public org.omg.CosNotifyComm.NotifyPublish _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CosNotifyComm.NotifyPublish __r = org.omg.CosNotifyComm.NotifyPublishHelper.narrow(__o);
		return __r;
	}
	public NotifyPublishOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(NotifyPublishOperations delegate)
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
	public void offer_change(org.omg.CosNotification.EventType[] added, org.omg.CosNotification.EventType[] removed) throws org.omg.CosNotifyComm.InvalidEventType
	{
_delegate.offer_change(added,removed);
	}

}
