package org.omg.CORBA;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "Policy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class PolicyPOATie
	extends PolicyPOA
{
	private PolicyOperations _delegate;

	private POA _poa;
	public PolicyPOATie(PolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public PolicyPOATie(PolicyOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CORBA.Policy _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CORBA.Policy __r = org.omg.CORBA.PolicyHelper.narrow(__o);
		return __r;
	}
	public org.omg.CORBA.Policy _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CORBA.Policy __r = org.omg.CORBA.PolicyHelper.narrow(__o);
		return __r;
	}
	public PolicyOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(PolicyOperations delegate)
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
