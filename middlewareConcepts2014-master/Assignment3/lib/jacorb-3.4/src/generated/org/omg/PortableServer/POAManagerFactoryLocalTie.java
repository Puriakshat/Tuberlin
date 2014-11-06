package org.omg.PortableServer;


/**
 * Generated from IDL interface "POAManagerFactory".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class POAManagerFactoryLocalTie
	extends _POAManagerFactoryLocalBase
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private POAManagerFactoryOperations _delegate;

	public POAManagerFactoryLocalTie(POAManagerFactoryOperations delegate)
	{
		_delegate = delegate;
	}
	public POAManagerFactoryOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(POAManagerFactoryOperations delegate)
	{
		_delegate = delegate;
	}
	public org.omg.PortableServer.POAManager find(java.lang.String id)
	{
		return _delegate.find(id);
	}

	public org.omg.PortableServer.POAManager[] list()
	{
		return _delegate.list();
	}

	public org.omg.PortableServer.POAManager create_POAManager(java.lang.String id, org.omg.CORBA.Policy[] policies) throws org.omg.PortableServer.POAManagerFactoryPackage.ManagerAlreadyExists,org.omg.CORBA.PolicyError
	{
		return _delegate.create_POAManager(id,policies);
	}

}
