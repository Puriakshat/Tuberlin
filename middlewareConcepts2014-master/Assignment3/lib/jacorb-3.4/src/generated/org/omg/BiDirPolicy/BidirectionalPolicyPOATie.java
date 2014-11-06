package org.omg.BiDirPolicy;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "BidirectionalPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class BidirectionalPolicyPOATie
	extends BidirectionalPolicyPOA
{
	private BidirectionalPolicyOperations _delegate;

	private POA _poa;
	public BidirectionalPolicyPOATie(BidirectionalPolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public BidirectionalPolicyPOATie(BidirectionalPolicyOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.BiDirPolicy.BidirectionalPolicy _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.BiDirPolicy.BidirectionalPolicy __r = org.omg.BiDirPolicy.BidirectionalPolicyHelper.narrow(__o);
		return __r;
	}
	public org.omg.BiDirPolicy.BidirectionalPolicy _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.BiDirPolicy.BidirectionalPolicy __r = org.omg.BiDirPolicy.BidirectionalPolicyHelper.narrow(__o);
		return __r;
	}
	public BidirectionalPolicyOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(BidirectionalPolicyOperations delegate)
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
	public short value()
	{
		return _delegate.value();
	}

	public int policy_type()
	{
		return _delegate.policy_type();
	}

	public org.omg.CORBA.Policy copy()
	{
		return _delegate.copy();
	}

	public void destroy()
	{
_delegate.destroy();
	}

}
