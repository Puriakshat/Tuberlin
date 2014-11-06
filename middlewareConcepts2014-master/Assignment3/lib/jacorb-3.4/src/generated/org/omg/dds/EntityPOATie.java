package org.omg.dds;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "Entity".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class EntityPOATie
	extends EntityPOA
{
	private EntityOperations _delegate;

	private POA _poa;
	public EntityPOATie(EntityOperations delegate)
	{
		_delegate = delegate;
	}
	public EntityPOATie(EntityOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.dds.Entity _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.dds.Entity __r = org.omg.dds.EntityHelper.narrow(__o);
		return __r;
	}
	public org.omg.dds.Entity _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.dds.Entity __r = org.omg.dds.EntityHelper.narrow(__o);
		return __r;
	}
	public EntityOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(EntityOperations delegate)
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
	public int enable()
	{
		return _delegate.enable();
	}

	public int get_status_changes()
	{
		return _delegate.get_status_changes();
	}

	public org.omg.dds.StatusCondition get_statuscondition()
	{
		return _delegate.get_statuscondition();
	}

}
