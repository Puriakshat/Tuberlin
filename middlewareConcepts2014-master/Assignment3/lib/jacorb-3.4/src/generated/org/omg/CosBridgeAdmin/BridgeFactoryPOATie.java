package org.omg.CosBridgeAdmin;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "BridgeFactory".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class BridgeFactoryPOATie
	extends BridgeFactoryPOA
{
	private BridgeFactoryOperations _delegate;

	private POA _poa;
	public BridgeFactoryPOATie(BridgeFactoryOperations delegate)
	{
		_delegate = delegate;
	}
	public BridgeFactoryPOATie(BridgeFactoryOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosBridgeAdmin.BridgeFactory _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CosBridgeAdmin.BridgeFactory __r = org.omg.CosBridgeAdmin.BridgeFactoryHelper.narrow(__o);
		return __r;
	}
	public org.omg.CosBridgeAdmin.BridgeFactory _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CosBridgeAdmin.BridgeFactory __r = org.omg.CosBridgeAdmin.BridgeFactoryHelper.narrow(__o);
		return __r;
	}
	public BridgeFactoryOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(BridgeFactoryOperations delegate)
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
	public org.omg.CosBridgeAdmin.Bridge create_bridge(org.omg.CosBridgeAdmin.ExternalEndpoint source, org.omg.CosBridgeAdmin.ExternalEndpoint sink, org.omg.CORBA.IntHolder id) throws org.omg.CosBridgeAdmin.InvalidExternalEndPoints
	{
		return _delegate.create_bridge(source,sink,id);
	}

	public org.omg.CosBridgeAdmin.Bridge get_bridge_with_id(int id) throws org.omg.CosBridgeAdmin.BridgeNotFound
	{
		return _delegate.get_bridge_with_id(id);
	}

	public int[] get_all_bridges()
	{
		return _delegate.get_all_bridges();
	}

}
