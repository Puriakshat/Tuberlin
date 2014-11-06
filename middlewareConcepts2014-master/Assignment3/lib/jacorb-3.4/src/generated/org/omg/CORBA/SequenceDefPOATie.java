package org.omg.CORBA;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "SequenceDef".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class SequenceDefPOATie
	extends SequenceDefPOA
{
	private SequenceDefOperations _delegate;

	private POA _poa;
	public SequenceDefPOATie(SequenceDefOperations delegate)
	{
		_delegate = delegate;
	}
	public SequenceDefPOATie(SequenceDefOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CORBA.SequenceDef _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CORBA.SequenceDef __r = org.omg.CORBA.SequenceDefHelper.narrow(__o);
		return __r;
	}
	public org.omg.CORBA.SequenceDef _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CORBA.SequenceDef __r = org.omg.CORBA.SequenceDefHelper.narrow(__o);
		return __r;
	}
	public SequenceDefOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(SequenceDefOperations delegate)
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

	public org.omg.CORBA.TypeCode element_type()
	{
		return _delegate.element_type();
	}

	public org.omg.CORBA.IDLType element_type_def()
	{
		return _delegate.element_type_def();
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

	public void element_type_def(org.omg.CORBA.IDLType a)
	{
		_delegate.element_type_def(a);
	}

}
