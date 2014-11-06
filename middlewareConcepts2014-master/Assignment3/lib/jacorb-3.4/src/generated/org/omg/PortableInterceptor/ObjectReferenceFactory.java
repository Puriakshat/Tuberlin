package org.omg.PortableInterceptor;

/**
 * Generated from IDL abstract value type "ObjectReferenceFactory".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */


public interface ObjectReferenceFactory
	extends org.omg.CORBA.portable.ValueBase 
{
	/* operations  */
	org.omg.CORBA.Object make_object(java.lang.String repository_id, byte[] id);
}
