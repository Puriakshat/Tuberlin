package org.omg.CosCollection;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "SortedSetFactory".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class SortedSetFactoryPOATie
	extends SortedSetFactoryPOA
{
	private SortedSetFactoryOperations _delegate;

	private POA _poa;
	public SortedSetFactoryPOATie(SortedSetFactoryOperations delegate)
	{
		_delegate = delegate;
	}
	public SortedSetFactoryPOATie(SortedSetFactoryOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosCollection.SortedSetFactory _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CosCollection.SortedSetFactory __r = org.omg.CosCollection.SortedSetFactoryHelper.narrow(__o);
		return __r;
	}
	public org.omg.CosCollection.SortedSetFactory _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CosCollection.SortedSetFactory __r = org.omg.CosCollection.SortedSetFactoryHelper.narrow(__o);
		return __r;
	}
	public SortedSetFactoryOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(SortedSetFactoryOperations delegate)
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
	public org.omg.CosCollection.SortedSet create(org.omg.CosCollection.Operations ops, int expected_size)
	{
		return _delegate.create(ops,expected_size);
	}

	public org.omg.CosCollection.Collection generic_create(org.omg.CosCollection.NVPair[] parameters) throws org.omg.CosCollection.ParameterInvalid
	{
		return _delegate.generic_create(parameters);
	}

}
