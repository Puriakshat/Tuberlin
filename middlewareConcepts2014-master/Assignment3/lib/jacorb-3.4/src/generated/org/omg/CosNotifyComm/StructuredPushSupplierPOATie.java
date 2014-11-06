package org.omg.CosNotifyComm;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "StructuredPushSupplier".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class StructuredPushSupplierPOATie
	extends StructuredPushSupplierPOA
{
	private StructuredPushSupplierOperations _delegate;

	private POA _poa;
	public StructuredPushSupplierPOATie(StructuredPushSupplierOperations delegate)
	{
		_delegate = delegate;
	}
	public StructuredPushSupplierPOATie(StructuredPushSupplierOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosNotifyComm.StructuredPushSupplier _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CosNotifyComm.StructuredPushSupplier __r = org.omg.CosNotifyComm.StructuredPushSupplierHelper.narrow(__o);
		return __r;
	}
	public org.omg.CosNotifyComm.StructuredPushSupplier _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CosNotifyComm.StructuredPushSupplier __r = org.omg.CosNotifyComm.StructuredPushSupplierHelper.narrow(__o);
		return __r;
	}
	public StructuredPushSupplierOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(StructuredPushSupplierOperations delegate)
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
	public void disconnect_structured_push_supplier()
	{
_delegate.disconnect_structured_push_supplier();
	}

	public void subscription_change(org.omg.CosNotification.EventType[] added, org.omg.CosNotification.EventType[] removed) throws org.omg.CosNotifyComm.InvalidEventType
	{
_delegate.subscription_change(added,removed);
	}

}
