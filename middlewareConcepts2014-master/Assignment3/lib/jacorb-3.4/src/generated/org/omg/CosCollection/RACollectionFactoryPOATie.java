package org.omg.CosCollection;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "RACollectionFactory".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class RACollectionFactoryPOATie
	extends RACollectionFactoryPOA
{
	private RACollectionFactoryOperations _delegate;

	private POA _poa;
	public RACollectionFactoryPOATie(RACollectionFactoryOperations delegate)
	{
		_delegate = delegate;
	}
	public RACollectionFactoryPOATie(RACollectionFactoryOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosCollection.RACollectionFactory _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CosCollection.RACollectionFactory __r = org.omg.CosCollection.RACollectionFactoryHelper.narrow(__o);
		return __r;
	}
	public org.omg.CosCollection.RACollectionFactory _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CosCollection.RACollectionFactory __r = org.omg.CosCollection.RACollectionFactoryHelper.narrow(__o);
		return __r;
	}
	public RACollectionFactoryOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(RACollectionFactoryOperations delegate)
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
	public org.omg.CosCollection.RestrictedAccessCollection generic_create(org.omg.CosCollection.NVPair[] parameters) throws org.omg.CosCollection.ParameterInvalid
	{
		return _delegate.generic_create(parameters);
	}

}
