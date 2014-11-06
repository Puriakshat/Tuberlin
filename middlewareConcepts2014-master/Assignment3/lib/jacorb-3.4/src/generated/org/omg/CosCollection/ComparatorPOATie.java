package org.omg.CosCollection;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "Comparator".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class ComparatorPOATie
	extends ComparatorPOA
{
	private ComparatorOperations _delegate;

	private POA _poa;
	public ComparatorPOATie(ComparatorOperations delegate)
	{
		_delegate = delegate;
	}
	public ComparatorPOATie(ComparatorOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosCollection.Comparator _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CosCollection.Comparator __r = org.omg.CosCollection.ComparatorHelper.narrow(__o);
		return __r;
	}
	public org.omg.CosCollection.Comparator _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CosCollection.Comparator __r = org.omg.CosCollection.ComparatorHelper.narrow(__o);
		return __r;
	}
	public ComparatorOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ComparatorOperations delegate)
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
	public int compare(org.omg.CORBA.Any element1, org.omg.CORBA.Any element2)
	{
		return _delegate.compare(element1,element2);
	}

}
