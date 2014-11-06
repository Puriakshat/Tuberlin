package org.omg.CosEventChannelAdmin;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "SupplierAdmin".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class SupplierAdminPOATie
	extends SupplierAdminPOA
{
	private SupplierAdminOperations _delegate;

	private POA _poa;
	public SupplierAdminPOATie(SupplierAdminOperations delegate)
	{
		_delegate = delegate;
	}
	public SupplierAdminPOATie(SupplierAdminOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosEventChannelAdmin.SupplierAdmin _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CosEventChannelAdmin.SupplierAdmin __r = org.omg.CosEventChannelAdmin.SupplierAdminHelper.narrow(__o);
		return __r;
	}
	public org.omg.CosEventChannelAdmin.SupplierAdmin _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CosEventChannelAdmin.SupplierAdmin __r = org.omg.CosEventChannelAdmin.SupplierAdminHelper.narrow(__o);
		return __r;
	}
	public SupplierAdminOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(SupplierAdminOperations delegate)
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
	public org.omg.CosEventChannelAdmin.ProxyPushConsumer obtain_push_consumer()
	{
		return _delegate.obtain_push_consumer();
	}

	public org.omg.CosEventChannelAdmin.ProxyPullConsumer obtain_pull_consumer()
	{
		return _delegate.obtain_pull_consumer();
	}

}
