package org.omg.dds;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "ReadCondition".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class ReadConditionPOATie
	extends ReadConditionPOA
{
	private ReadConditionOperations _delegate;

	private POA _poa;
	public ReadConditionPOATie(ReadConditionOperations delegate)
	{
		_delegate = delegate;
	}
	public ReadConditionPOATie(ReadConditionOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.dds.ReadCondition _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.dds.ReadCondition __r = org.omg.dds.ReadConditionHelper.narrow(__o);
		return __r;
	}
	public org.omg.dds.ReadCondition _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.dds.ReadCondition __r = org.omg.dds.ReadConditionHelper.narrow(__o);
		return __r;
	}
	public ReadConditionOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ReadConditionOperations delegate)
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
	public org.omg.dds.DataReader get_datareader()
	{
		return _delegate.get_datareader();
	}

	public int get_instance_state_mask()
	{
		return _delegate.get_instance_state_mask();
	}

	public int get_view_state_mask()
	{
		return _delegate.get_view_state_mask();
	}

	public int get_sample_state_mask()
	{
		return _delegate.get_sample_state_mask();
	}

	public boolean get_trigger_value()
	{
		return _delegate.get_trigger_value();
	}

}
