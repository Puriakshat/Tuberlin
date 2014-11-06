package org.omg.PortableInterceptor;


/**
 * Generated from IDL interface "IORInfo".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface IORInfoOperations
{
	/* constants */
	/* operations  */
	org.omg.CORBA.Policy get_effective_policy(int type);
	void add_ior_component(org.omg.IOP.TaggedComponent a_component);
	void add_ior_component_to_profile(org.omg.IOP.TaggedComponent a_component, int profile_id);
}
