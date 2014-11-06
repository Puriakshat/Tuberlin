package org.omg.dds;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "GuardCondition".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class GuardConditionPOATie
	extends GuardConditionPOA
{
	private GuardConditionOperations _delegate;

	private POA _poa;
	public GuardConditionPOATie(GuardConditionOperations delegate)
	{
		_delegate = delegate;
	}
	public GuardConditionPOATie(GuardConditionOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.dds.GuardCondition _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.dds.GuardCondition __r = org.omg.dds.GuardConditionHelper.narrow(__o);
		return __r;
	}
	public org.omg.dds.GuardCondition _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.dds.GuardCondition __r = org.omg.dds.GuardConditionHelper.narrow(__o);
		return __r;
	}
	public GuardConditionOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(GuardConditionOperations delegate)
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
	public void set_trigger_value(boolean value)
	{
_delegate.set_trigger_value(value);
	}

	public boolean get_trigger_value()
	{
		return _delegate.get_trigger_value();
	}

}
