package org.omg.CORBA;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "FixedDef".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class FixedDefPOATie
	extends FixedDefPOA
{
	private FixedDefOperations _delegate;

	private POA _poa;
	public FixedDefPOATie(FixedDefOperations delegate)
	{
		_delegate = delegate;
	}
	public FixedDefPOATie(FixedDefOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CORBA.FixedDef _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CORBA.FixedDef __r = org.omg.CORBA.FixedDefHelper.narrow(__o);
		return __r;
	}
	public org.omg.CORBA.FixedDef _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CORBA.FixedDef __r = org.omg.CORBA.FixedDefHelper.narrow(__o);
		return __r;
	}
	public FixedDefOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(FixedDefOperations delegate)
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
	public void scale(short a)
	{
		_delegate.scale(a);
	}

	public void digits(short a)
	{
		_delegate.digits(a);
	}

	public short digits()
	{
		return _delegate.digits();
	}

	public org.omg.CORBA.TypeCode type()
	{
		return _delegate.type();
	}

	public void destroy()
	{
_delegate.destroy();
	}

	public short scale()
	{
		return _delegate.scale();
	}

	public org.omg.CORBA.DefinitionKind def_kind()
	{
		return _delegate.def_kind();
	}

}
