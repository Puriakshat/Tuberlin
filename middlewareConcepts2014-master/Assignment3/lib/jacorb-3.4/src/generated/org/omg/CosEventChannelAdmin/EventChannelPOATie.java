package org.omg.CosEventChannelAdmin;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "EventChannel".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class EventChannelPOATie
	extends EventChannelPOA
{
	private EventChannelOperations _delegate;

	private POA _poa;
	public EventChannelPOATie(EventChannelOperations delegate)
	{
		_delegate = delegate;
	}
	public EventChannelPOATie(EventChannelOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosEventChannelAdmin.EventChannel _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CosEventChannelAdmin.EventChannel __r = org.omg.CosEventChannelAdmin.EventChannelHelper.narrow(__o);
		return __r;
	}
	public org.omg.CosEventChannelAdmin.EventChannel _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CosEventChannelAdmin.EventChannel __r = org.omg.CosEventChannelAdmin.EventChannelHelper.narrow(__o);
		return __r;
	}
	public EventChannelOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(EventChannelOperations delegate)
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
	public org.omg.CosEventChannelAdmin.ConsumerAdmin for_consumers()
	{
		return _delegate.for_consumers();
	}

	public void destroy()
	{
_delegate.destroy();
	}

	public org.omg.CosEventChannelAdmin.SupplierAdmin for_suppliers()
	{
		return _delegate.for_suppliers();
	}

}
