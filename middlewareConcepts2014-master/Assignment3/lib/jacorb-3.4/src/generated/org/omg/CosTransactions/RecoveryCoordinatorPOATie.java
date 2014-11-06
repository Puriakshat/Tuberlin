package org.omg.CosTransactions;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "RecoveryCoordinator".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class RecoveryCoordinatorPOATie
	extends RecoveryCoordinatorPOA
{
	private RecoveryCoordinatorOperations _delegate;

	private POA _poa;
	public RecoveryCoordinatorPOATie(RecoveryCoordinatorOperations delegate)
	{
		_delegate = delegate;
	}
	public RecoveryCoordinatorPOATie(RecoveryCoordinatorOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosTransactions.RecoveryCoordinator _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CosTransactions.RecoveryCoordinator __r = org.omg.CosTransactions.RecoveryCoordinatorHelper.narrow(__o);
		return __r;
	}
	public org.omg.CosTransactions.RecoveryCoordinator _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CosTransactions.RecoveryCoordinator __r = org.omg.CosTransactions.RecoveryCoordinatorHelper.narrow(__o);
		return __r;
	}
	public RecoveryCoordinatorOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(RecoveryCoordinatorOperations delegate)
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
	public org.omg.CosTransactions.Status replay_completion(org.omg.CosTransactions.Resource r) throws org.omg.CosTransactions.NotPrepared
	{
		return _delegate.replay_completion(r);
	}

}
