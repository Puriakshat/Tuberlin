package org.omg.CosTransactions;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "Synchronization".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class SynchronizationPOATie
	extends SynchronizationPOA
{
	private SynchronizationOperations _delegate;

	private POA _poa;
	public SynchronizationPOATie(SynchronizationOperations delegate)
	{
		_delegate = delegate;
	}
	public SynchronizationPOATie(SynchronizationOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosTransactions.Synchronization _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CosTransactions.Synchronization __r = org.omg.CosTransactions.SynchronizationHelper.narrow(__o);
		return __r;
	}
	public org.omg.CosTransactions.Synchronization _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CosTransactions.Synchronization __r = org.omg.CosTransactions.SynchronizationHelper.narrow(__o);
		return __r;
	}
	public SynchronizationOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(SynchronizationOperations delegate)
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
	public void before_completion()
	{
_delegate.before_completion();
	}

	public void after_completion(org.omg.CosTransactions.Status status_)
	{
_delegate.after_completion(status_);
	}

}
