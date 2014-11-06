package org.omg.CORBA;


/**
 * Generated from IDL interface "SequenceDef".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface SequenceDefOperations
	extends org.omg.CORBA.IDLTypeOperations
{
	/* constants */
	/* operations  */
	int bound();
	void bound(int arg);
	org.omg.CORBA.TypeCode element_type();
	org.omg.CORBA.IDLType element_type_def();
	void element_type_def(org.omg.CORBA.IDLType arg);
}
