package org.omg.CosCollection;


/**
 * Generated from IDL interface "Operations".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface OperationsOperations
{
	/* constants */
	/* operations  */
	org.omg.CORBA.TypeCode element_type();
	boolean check_element_type(org.omg.CORBA.Any element);
	boolean equal(org.omg.CORBA.Any element1, org.omg.CORBA.Any element2);
	int compare(org.omg.CORBA.Any element1, org.omg.CORBA.Any element2);
	int hash(org.omg.CORBA.Any element, int value);
	org.omg.CORBA.Any key(org.omg.CORBA.Any element);
	org.omg.CORBA.TypeCode key_type();
	boolean check_key_type(org.omg.CORBA.Any key);
	boolean key_equal(org.omg.CORBA.Any key1, org.omg.CORBA.Any key2);
	int key_compare(org.omg.CORBA.Any key1, org.omg.CORBA.Any key2);
	int key_hash(org.omg.CORBA.Any thisKey, int value);
	void destroy();
}
