package org.omg.CosCollection;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "SortedBagFactory".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class SortedBagFactoryPOATie
	extends SortedBagFactoryPOA
{
	private SortedBagFactoryOperations _delegate;

	private POA _poa;
	public SortedBagFactoryPOATie(SortedBagFactoryOperations delegate)
	{
		_delegate = delegate;
	}
	public SortedBagFactoryPOATie(SortedBagFactoryOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosCollection.SortedBagFactory _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CosCollection.SortedBagFactory __r = org.omg.CosCollection.SortedBagFactoryHelper.narrow(__o);
		return __r;
	}
	public org.omg.CosCollection.SortedBagFactory _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CosCollection.SortedBagFactory __r = org.omg.CosCollection.SortedBagFactoryHelper.narrow(__o);
		return __r;
	}
	public SortedBagFactoryOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(SortedBagFactoryOperations delegate)
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
	public org.omg.CosCollection.SortedBag create(org.omg.CosCollection.Operations ops, int expected_size)
	{
		return _delegate.create(ops,expected_size);
	}

}
