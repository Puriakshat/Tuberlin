package org.omg.PortableInterceptor;

/**
 * Generated from IDL abstract value type "ObjectReferenceTemplate".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */


public interface ObjectReferenceTemplate
	extends org.omg.CORBA.portable.ValueBase , org.omg.PortableInterceptor.ObjectReferenceFactory
{
	/* operations  */
	java.lang.String server_id();
	java.lang.String orb_id();
	java.lang.String[] adapter_name();
}
