package org.omg.CORBA;


/**
 * Generated from IDL interface "ExtValueDef".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface ExtValueDefOperations
	extends org.omg.CORBA.ValueDefOperations
{
	/* constants */
	/* operations  */
	org.omg.CORBA.ExtInitializer[] ext_initializers();
	void ext_initializers(org.omg.CORBA.ExtInitializer[] arg);
	org.omg.CORBA.ExtValueDefPackage.ExtFullValueDescription describe_ext_value();
	org.omg.CORBA.ExtAttributeDef create_ext_attribute(java.lang.String id, java.lang.String name, java.lang.String version, org.omg.CORBA.IDLType type, org.omg.CORBA.AttributeMode mode, org.omg.CORBA.ExceptionDef[] get_exceptions, org.omg.CORBA.ExceptionDef[] set_exceptions);
}
