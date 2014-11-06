package org.omg.CosCollection;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "DequeFactory".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class DequeFactoryPOATie
	extends DequeFactoryPOA
{
	private DequeFactoryOperations _delegate;

	private POA _poa;
	public DequeFactoryPOATie(DequeFactoryOperations delegate)
	{
		_delegate = delegate;
	}
	public DequeFactoryPOATie(DequeFactoryOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosCollection.DequeFactory _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CosCollection.DequeFactory __r = org.omg.CosCollection.DequeFactoryHelper.narrow(__o);
		return __r;
	}
	public org.omg.CosCollection.DequeFactory _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CosCollection.DequeFactory __r = org.omg.CosCollection.DequeFactoryHelper.narrow(__o);
		return __r;
	}
	public DequeFactoryOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(DequeFactoryOperations delegate)
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
	public org.omg.CosCollection.Deque create(org.omg.CosCollection.Operations ops, int expected_size)
	{
		return _delegate.create(ops,expected_size);
	}

	public org.omg.CosCollection.RestrictedAccessCollection generic_create(org.omg.CosCollection.NVPair[] parameters) throws org.omg.CosCollection.ParameterInvalid
	{
		return _delegate.generic_create(parameters);
	}

}
