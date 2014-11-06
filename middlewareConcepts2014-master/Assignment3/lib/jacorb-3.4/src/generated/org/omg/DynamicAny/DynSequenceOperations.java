package org.omg.DynamicAny;


/**
 * Generated from IDL interface "DynSequence".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface DynSequenceOperations
	extends org.omg.DynamicAny.DynAnyOperations
{
	/* constants */
	/* operations  */
	int get_length();
	void set_length(int len) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue;
	org.omg.CORBA.Any[] get_elements();
	void set_elements(org.omg.CORBA.Any[] value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch;
	org.omg.DynamicAny.DynAny[] get_elements_as_dyn_any();
	void set_elements_as_dyn_any(org.omg.DynamicAny.DynAny[] value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch;
}
