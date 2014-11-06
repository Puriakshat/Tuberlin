package org.omg.dds;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "TypeSupport".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class TypeSupportPOATie
	extends TypeSupportPOA
{
	private TypeSupportOperations _delegate;

	private POA _poa;
	public TypeSupportPOATie(TypeSupportOperations delegate)
	{
		_delegate = delegate;
	}
	public TypeSupportPOATie(TypeSupportOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.dds.TypeSupport _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.dds.TypeSupport __r = org.omg.dds.TypeSupportHelper.narrow(__o);
		return __r;
	}
	public org.omg.dds.TypeSupport _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.dds.TypeSupport __r = org.omg.dds.TypeSupportHelper.narrow(__o);
		return __r;
	}
	public TypeSupportOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TypeSupportOperations delegate)
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
}
