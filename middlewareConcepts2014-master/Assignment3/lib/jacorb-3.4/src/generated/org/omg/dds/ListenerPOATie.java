package org.omg.dds;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "Listener".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class ListenerPOATie
	extends ListenerPOA
{
	private ListenerOperations _delegate;

	private POA _poa;
	public ListenerPOATie(ListenerOperations delegate)
	{
		_delegate = delegate;
	}
	public ListenerPOATie(ListenerOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.dds.Listener _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.dds.Listener __r = org.omg.dds.ListenerHelper.narrow(__o);
		return __r;
	}
	public org.omg.dds.Listener _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.dds.Listener __r = org.omg.dds.ListenerHelper.narrow(__o);
		return __r;
	}
	public ListenerOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ListenerOperations delegate)
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
