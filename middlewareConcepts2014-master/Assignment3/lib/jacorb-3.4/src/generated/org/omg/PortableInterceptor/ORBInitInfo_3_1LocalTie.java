package org.omg.PortableInterceptor;


/**
 * Generated from IDL interface "ORBInitInfo_3_1".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class ORBInitInfo_3_1LocalTie
	extends _ORBInitInfo_3_1LocalBase
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private ORBInitInfo_3_1Operations _delegate;

	public ORBInitInfo_3_1LocalTie(ORBInitInfo_3_1Operations delegate)
	{
		_delegate = delegate;
	}
	public ORBInitInfo_3_1Operations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ORBInitInfo_3_1Operations delegate)
	{
		_delegate = delegate;
	}
	public org.omg.CORBA.Object resolve_initial_references(java.lang.String id) throws org.omg.PortableInterceptor.ORBInitInfoPackage.InvalidName
	{
		return _delegate.resolve_initial_references(id);
	}

	public void add_client_request_interceptor(org.omg.PortableInterceptor.ClientRequestInterceptor interceptor) throws org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateName
	{
_delegate.add_client_request_interceptor(interceptor);
	}

	public void add_ior_interceptor(org.omg.PortableInterceptor.IORInterceptor interceptor) throws org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateName
	{
_delegate.add_ior_interceptor(interceptor);
	}

	public java.lang.String orb_id()
	{
		return _delegate.orb_id();
	}

	public org.omg.IOP.CodecFactory codec_factory()
	{
		return _delegate.codec_factory();
	}

	public void add_client_request_interceptor_with_policy(org.omg.PortableInterceptor.ClientRequestInterceptor interceptor, org.omg.CORBA.Policy[] policies) throws org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateName,org.omg.CORBA.PolicyError
	{
_delegate.add_client_request_interceptor_with_policy(interceptor,policies);
	}

	public java.lang.String[] arguments()
	{
		return _delegate.arguments();
	}

	public int allocate_slot_id()
	{
		return _delegate.allocate_slot_id();
	}

	public void add_server_request_interceptor_with_policy(org.omg.PortableInterceptor.ServerRequestInterceptor interceptor, org.omg.CORBA.Policy[] policies) throws org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateName,org.omg.CORBA.PolicyError
	{
_delegate.add_server_request_interceptor_with_policy(interceptor,policies);
	}

	public void add_server_request_interceptor(org.omg.PortableInterceptor.ServerRequestInterceptor interceptor) throws org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateName
	{
_delegate.add_server_request_interceptor(interceptor);
	}

	public void add_ior_interceptor_with_policy(org.omg.PortableInterceptor.IORInterceptor interceptor, org.omg.CORBA.Policy[] policies) throws org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateName,org.omg.CORBA.PolicyError
	{
_delegate.add_ior_interceptor_with_policy(interceptor,policies);
	}

	public void register_policy_factory(int type, org.omg.PortableInterceptor.PolicyFactory policy_factory)
	{
_delegate.register_policy_factory(type,policy_factory);
	}

	public void register_initial_reference(java.lang.String id, org.omg.CORBA.Object obj) throws org.omg.PortableInterceptor.ORBInitInfoPackage.InvalidName
	{
_delegate.register_initial_reference(id,obj);
	}

}
