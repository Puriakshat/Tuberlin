package org.omg.CORBA;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "IRObject".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class IRObjectPOATie
	extends IRObjectPOA
{
	private IRObjectOperations _delegate;

	private POA _poa;
	public IRObjectPOATie(IRObjectOperations delegate)
	{
		_delegate = delegate;
	}
	public IRObjectPOATie(IRObjectOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CORBA.IRObject _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CORBA.IRObject __r = org.omg.CORBA.IRObjectHelper.narrow(__o);
		return __r;
	}
	public org.omg.CORBA.IRObject _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CORBA.IRObject __r = org.omg.CORBA.IRObjectHelper.narrow(__o);
		return __r;
	}
	public IRObjectOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(IRObjectOperations delegate)
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
	public void destroy()
	{
_delegate.destroy();
	}

	public org.omg.CORBA.DefinitionKind def_kind()
	{
		return _delegate.def_kind();
	}

}
