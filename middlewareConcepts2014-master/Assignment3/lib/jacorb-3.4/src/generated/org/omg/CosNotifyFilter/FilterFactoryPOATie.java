package org.omg.CosNotifyFilter;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "FilterFactory".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class FilterFactoryPOATie
	extends FilterFactoryPOA
{
	private FilterFactoryOperations _delegate;

	private POA _poa;
	public FilterFactoryPOATie(FilterFactoryOperations delegate)
	{
		_delegate = delegate;
	}
	public FilterFactoryPOATie(FilterFactoryOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosNotifyFilter.FilterFactory _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CosNotifyFilter.FilterFactory __r = org.omg.CosNotifyFilter.FilterFactoryHelper.narrow(__o);
		return __r;
	}
	public org.omg.CosNotifyFilter.FilterFactory _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CosNotifyFilter.FilterFactory __r = org.omg.CosNotifyFilter.FilterFactoryHelper.narrow(__o);
		return __r;
	}
	public FilterFactoryOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(FilterFactoryOperations delegate)
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
	public org.omg.CosNotifyFilter.MappingFilter create_mapping_filter(java.lang.String constraint_grammar, org.omg.CORBA.Any default_value) throws org.omg.CosNotifyFilter.InvalidGrammar
	{
		return _delegate.create_mapping_filter(constraint_grammar,default_value);
	}

	public org.omg.CosNotifyFilter.Filter create_filter(java.lang.String constraint_grammar) throws org.omg.CosNotifyFilter.InvalidGrammar
	{
		return _delegate.create_filter(constraint_grammar);
	}

}
