package org.omg.DynamicAny;


/**
 * Generated from IDL interface "DynValue".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface DynValueOperations
	extends org.omg.DynamicAny.DynValueCommonOperations
{
	/* constants */
	/* operations  */
	java.lang.String current_member_name() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch;
	org.omg.CORBA.TCKind current_member_kind() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch;
	org.omg.DynamicAny.NameValuePair[] get_members() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue;
	void set_members(org.omg.DynamicAny.NameValuePair[] value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch;
	org.omg.DynamicAny.NameDynAnyPair[] get_members_as_dyn_any() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue;
	void set_members_as_dyn_any(org.omg.DynamicAny.NameDynAnyPair[] value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch;
}
