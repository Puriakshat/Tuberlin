package org.omg.CosTransactions;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "TransactionalObject".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class TransactionalObjectPOATie
	extends TransactionalObjectPOA
{
	private TransactionalObjectOperations _delegate;

	private POA _poa;
	public TransactionalObjectPOATie(TransactionalObjectOperations delegate)
	{
		_delegate = delegate;
	}
	public TransactionalObjectPOATie(TransactionalObjectOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosTransactions.TransactionalObject _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CosTransactions.TransactionalObject __r = org.omg.CosTransactions.TransactionalObjectHelper.narrow(__o);
		return __r;
	}
	public org.omg.CosTransactions.TransactionalObject _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CosTransactions.TransactionalObject __r = org.omg.CosTransactions.TransactionalObjectHelper.narrow(__o);
		return __r;
	}
	public TransactionalObjectOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TransactionalObjectOperations delegate)
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
