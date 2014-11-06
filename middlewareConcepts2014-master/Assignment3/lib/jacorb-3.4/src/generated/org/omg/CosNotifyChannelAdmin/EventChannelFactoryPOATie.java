package org.omg.CosNotifyChannelAdmin;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "EventChannelFactory".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class EventChannelFactoryPOATie
	extends EventChannelFactoryPOA
{
	private EventChannelFactoryOperations _delegate;

	private POA _poa;
	public EventChannelFactoryPOATie(EventChannelFactoryOperations delegate)
	{
		_delegate = delegate;
	}
	public EventChannelFactoryPOATie(EventChannelFactoryOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosNotifyChannelAdmin.EventChannelFactory _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CosNotifyChannelAdmin.EventChannelFactory __r = org.omg.CosNotifyChannelAdmin.EventChannelFactoryHelper.narrow(__o);
		return __r;
	}
	public org.omg.CosNotifyChannelAdmin.EventChannelFactory _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CosNotifyChannelAdmin.EventChannelFactory __r = org.omg.CosNotifyChannelAdmin.EventChannelFactoryHelper.narrow(__o);
		return __r;
	}
	public EventChannelFactoryOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(EventChannelFactoryOperations delegate)
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
	public org.omg.CosNotifyChannelAdmin.EventChannel create_channel(org.omg.CosNotification.Property[] initial_qos, org.omg.CosNotification.Property[] initial_admin, org.omg.CORBA.IntHolder id) throws org.omg.CosNotification.UnsupportedAdmin,org.omg.CosNotification.UnsupportedQoS
	{
		return _delegate.create_channel(initial_qos,initial_admin,id);
	}

	public org.omg.CosNotifyChannelAdmin.EventChannel get_event_channel(int id) throws org.omg.CosNotifyChannelAdmin.ChannelNotFound
	{
		return _delegate.get_event_channel(id);
	}

	public int[] get_all_channels()
	{
		return _delegate.get_all_channels();
	}

}
