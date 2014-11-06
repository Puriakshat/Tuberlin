package org.omg.dds;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "Condition".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class ConditionPOATie
	extends ConditionPOA
{
	private ConditionOperations _delegate;

	private POA _poa;
	public ConditionPOATie(ConditionOperations delegate)
	{
		_delegate = delegate;
	}
	public ConditionPOATie(ConditionOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.dds.Condition _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.dds.Condition __r = org.omg.dds.ConditionHelper.narrow(__o);
		return __r;
	}
	public org.omg.dds.Condition _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.dds.Condition __r = org.omg.dds.ConditionHelper.narrow(__o);
		return __r;
	}
	public ConditionOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ConditionOperations delegate)
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
	public boolean get_trigger_value()
	{
		return _delegate.get_trigger_value();
	}

}
