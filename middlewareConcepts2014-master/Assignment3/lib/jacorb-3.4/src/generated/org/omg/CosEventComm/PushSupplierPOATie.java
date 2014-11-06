package org.omg.CosEventComm;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "PushSupplier".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class PushSupplierPOATie
	extends PushSupplierPOA
{
	private PushSupplierOperations _delegate;

	private POA _poa;
	public PushSupplierPOATie(PushSupplierOperations delegate)
	{
		_delegate = delegate;
	}
	public PushSupplierPOATie(PushSupplierOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosEventComm.PushSupplier _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CosEventComm.PushSupplier __r = org.omg.CosEventComm.PushSupplierHelper.narrow(__o);
		return __r;
	}
	public org.omg.CosEventComm.PushSupplier _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CosEventComm.PushSupplier __r = org.omg.CosEventComm.PushSupplierHelper.narrow(__o);
		return __r;
	}
	public PushSupplierOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(PushSupplierOperations delegate)
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
	public void disconnect_push_supplier()
	{
_delegate.disconnect_push_supplier();
	}

}
