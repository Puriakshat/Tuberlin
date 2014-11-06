package org.omg.CORBA;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "StringDef".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class StringDefPOATie
	extends StringDefPOA
{
	private StringDefOperations _delegate;

	private POA _poa;
	public StringDefPOATie(StringDefOperations delegate)
	{
		_delegate = delegate;
	}
	public StringDefPOATie(StringDefOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CORBA.StringDef _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CORBA.StringDef __r = org.omg.CORBA.StringDefHelper.narrow(__o);
		return __r;
	}
	public org.omg.CORBA.StringDef _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CORBA.StringDef __r = org.omg.CORBA.StringDefHelper.narrow(__o);
		return __r;
	}
	public StringDefOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(StringDefOperations delegate)
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
	public void bound(int a)
	{
		_delegate.bound(a);
	}

	public int bound()
	{
		return _delegate.bound();
	}

	public org.omg.CORBA.TypeCode type()
	{
		return _delegate.type();
	}

	public void destroy()
	{
_delegate.destroy();
	}

	public org.omg.CORBA.DefinitionKind def_kind()
	{
		return _delegate.def_kind();
	}

}
