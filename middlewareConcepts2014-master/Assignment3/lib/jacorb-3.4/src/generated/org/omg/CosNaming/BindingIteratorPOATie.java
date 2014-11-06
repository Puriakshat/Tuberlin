package org.omg.CosNaming;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "BindingIterator".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class BindingIteratorPOATie
	extends BindingIteratorPOA
{
	private BindingIteratorOperations _delegate;

	private POA _poa;
	public BindingIteratorPOATie(BindingIteratorOperations delegate)
	{
		_delegate = delegate;
	}
	public BindingIteratorPOATie(BindingIteratorOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosNaming.BindingIterator _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CosNaming.BindingIterator __r = org.omg.CosNaming.BindingIteratorHelper.narrow(__o);
		return __r;
	}
	public org.omg.CosNaming.BindingIterator _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CosNaming.BindingIterator __r = org.omg.CosNaming.BindingIteratorHelper.narrow(__o);
		return __r;
	}
	public BindingIteratorOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(BindingIteratorOperations delegate)
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
	public boolean next_one(org.omg.CosNaming.BindingHolder b)
	{
		return _delegate.next_one(b);
	}

	public boolean next_n(int how_many, org.omg.CosNaming.BindingListHolder bl)
	{
		return _delegate.next_n(how_many,bl);
	}

	public void destroy()
	{
_delegate.destroy();
	}

}
