package org.omg.CosCollection;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "BagFactory".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class BagFactoryPOATie
	extends BagFactoryPOA
{
	private BagFactoryOperations _delegate;

	private POA _poa;
	public BagFactoryPOATie(BagFactoryOperations delegate)
	{
		_delegate = delegate;
	}
	public BagFactoryPOATie(BagFactoryOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosCollection.BagFactory _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CosCollection.BagFactory __r = org.omg.CosCollection.BagFactoryHelper.narrow(__o);
		return __r;
	}
	public org.omg.CosCollection.BagFactory _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CosCollection.BagFactory __r = org.omg.CosCollection.BagFactoryHelper.narrow(__o);
		return __r;
	}
	public BagFactoryOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(BagFactoryOperations delegate)
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
	public org.omg.CosCollection.Bag create(org.omg.CosCollection.Operations ops, int expected_size)
	{
		return _delegate.create(ops,expected_size);
	}

}
