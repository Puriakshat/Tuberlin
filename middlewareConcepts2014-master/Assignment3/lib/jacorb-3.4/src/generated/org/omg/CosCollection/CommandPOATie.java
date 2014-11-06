package org.omg.CosCollection;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "Command".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class CommandPOATie
	extends CommandPOA
{
	private CommandOperations _delegate;

	private POA _poa;
	public CommandPOATie(CommandOperations delegate)
	{
		_delegate = delegate;
	}
	public CommandPOATie(CommandOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosCollection.Command _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CosCollection.Command __r = org.omg.CosCollection.CommandHelper.narrow(__o);
		return __r;
	}
	public org.omg.CosCollection.Command _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CosCollection.Command __r = org.omg.CosCollection.CommandHelper.narrow(__o);
		return __r;
	}
	public CommandOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(CommandOperations delegate)
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
	public boolean do_on(org.omg.CORBA.Any element)
	{
		return _delegate.do_on(element);
	}

}
