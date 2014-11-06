package org.omg.CosCollection;


/**
 * Generated from IDL interface "EqualitySequentialIterator".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface EqualitySequentialIteratorOperations
	extends org.omg.CosCollection.EqualityIteratorOperations , org.omg.CosCollection.SequentialIteratorOperations
{
	/* constants */
	/* operations  */
	boolean set_to_first_element_with_value(org.omg.CORBA.Any element) throws org.omg.CosCollection.ElementInvalid;
	boolean set_to_last_element_with_value(org.omg.CORBA.Any element) throws org.omg.CosCollection.ElementInvalid;
	boolean set_to_previous_element_with_value(org.omg.CORBA.Any element) throws org.omg.CosCollection.ElementInvalid;
}
