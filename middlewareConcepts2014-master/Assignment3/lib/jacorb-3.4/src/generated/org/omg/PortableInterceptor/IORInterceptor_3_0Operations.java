package org.omg.PortableInterceptor;


/**
 * Generated from IDL interface "IORInterceptor_3_0".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface IORInterceptor_3_0Operations
	extends org.omg.PortableInterceptor.IORInterceptorOperations
{
	/* constants */
	/* operations  */
	void components_established(org.omg.PortableInterceptor.IORInfo info);
	void adapter_manager_state_changed(java.lang.String id, short state);
	void adapter_state_changed(org.omg.PortableInterceptor.ObjectReferenceTemplate[] templates, short state);
}
