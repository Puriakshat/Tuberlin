package org.omg.CosTypedEventComm;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "TypedPullSupplier".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class TypedPullSupplierPOATie
	extends TypedPullSupplierPOA
{
	private TypedPullSupplierOperations _delegate;

	private POA _poa;
	public TypedPullSupplierPOATie(TypedPullSupplierOperations delegate)
	{
		_delegate = delegate;
	}
	public TypedPullSupplierPOATie(TypedPullSupplierOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosTypedEventComm.TypedPullSupplier _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CosTypedEventComm.TypedPullSupplier __r = org.omg.CosTypedEventComm.TypedPullSupplierHelper.narrow(__o);
		return __r;
	}
	public org.omg.CosTypedEventComm.TypedPullSupplier _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CosTypedEventComm.TypedPullSupplier __r = org.omg.CosTypedEventComm.TypedPullSupplierHelper.narrow(__o);
		return __r;
	}
	public TypedPullSupplierOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TypedPullSupplierOperations delegate)
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
	public void disconnect_pull_supplier()
	{
_delegate.disconnect_pull_supplier();
	}

	public org.omg.CORBA.Any pull() throws org.omg.CosEventComm.Disconnected
	{
		return _delegate.pull();
	}

	public org.omg.CORBA.Object get_typed_supplier()
	{
		return _delegate.get_typed_supplier();
	}

	public org.omg.CORBA.Any try_pull(org.omg.CORBA.BooleanHolder has_event) throws org.omg.CosEventComm.Disconnected
	{
		return _delegate.try_pull(has_event);
	}

}
