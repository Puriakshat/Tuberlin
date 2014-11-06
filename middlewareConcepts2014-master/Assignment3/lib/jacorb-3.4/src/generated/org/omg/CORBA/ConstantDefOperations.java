package org.omg.CORBA;


/**
 * Generated from IDL interface "ConstantDef".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface ConstantDefOperations
	extends org.omg.CORBA.ContainedOperations
{
	/* constants */
	/* operations  */
	org.omg.CORBA.TypeCode type();
	org.omg.CORBA.IDLType type_def();
	void type_def(org.omg.CORBA.IDLType arg);
	org.omg.CORBA.Any value();
	void value(org.omg.CORBA.Any arg);
}
