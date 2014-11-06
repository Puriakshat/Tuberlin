package org.omg.CosCollection;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "SetFactory".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class SetFactoryPOATie
	extends SetFactoryPOA
{
	private SetFactoryOperations _delegate;

	private POA _poa;
	public SetFactoryPOATie(SetFactoryOperations delegate)
	{
		_delegate = delegate;
	}
	public SetFactoryPOATie(SetFactoryOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosCollection.SetFactory _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CosCollection.SetFactory __r = org.omg.CosCollection.SetFactoryHelper.narrow(__o);
		return __r;
	}
	public org.omg.CosCollection.SetFactory _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CosCollection.SetFactory __r = org.omg.CosCollection.SetFactoryHelper.narrow(__o);
		return __r;
	}
	public SetFactoryOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(SetFactoryOperations delegate)
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
	public org.omg.CosCollection.Set create(org.omg.CosCollection.Operations ops, int expected_size)
	{
		return _delegate.create(ops,expected_size);
	}

	public org.omg.CosCollection.Collection generic_create(org.omg.CosCollection.NVPair[] parameters) throws org.omg.CosCollection.ParameterInvalid
	{
		return _delegate.generic_create(parameters);
	}

}
