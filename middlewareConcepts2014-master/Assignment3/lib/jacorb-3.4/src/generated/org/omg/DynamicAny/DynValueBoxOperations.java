package org.omg.DynamicAny;


/**
 * Generated from IDL interface "DynValueBox".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface DynValueBoxOperations
	extends org.omg.DynamicAny.DynValueCommonOperations
{
	/* constants */
	/* operations  */
	org.omg.CORBA.Any get_boxed_value() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue;
	void set_boxed_value(org.omg.CORBA.Any boxed) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch;
	org.omg.DynamicAny.DynAny get_boxed_value_as_dyn_any() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue;
	void set_boxed_value_as_dyn_any(org.omg.DynamicAny.DynAny boxed) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch;
}
