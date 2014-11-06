package org.omg.CORBA;


/**
 * Generated from IDL interface "AttributeDef".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface AttributeDefOperations
	extends org.omg.CORBA.ContainedOperations
{
	/* constants */
	/* operations  */
	org.omg.CORBA.TypeCode type();
	org.omg.CORBA.IDLType type_def();
	void type_def(org.omg.CORBA.IDLType arg);
	org.omg.CORBA.AttributeMode mode();
	void mode(org.omg.CORBA.AttributeMode arg);
}
