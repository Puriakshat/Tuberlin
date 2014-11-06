package org.omg.CosCollection;


/**
 * Generated from IDL interface "SequentialIterator".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface SequentialIteratorOperations
	extends org.omg.CosCollection.OrderedIteratorOperations
{
	/* constants */
	/* operations  */
	boolean add_element_as_next_set_iterator(org.omg.CORBA.Any element) throws org.omg.CosCollection.ElementInvalid,org.omg.CosCollection.IteratorInvalid;
	void add_n_elements_as_next_set_iterator(org.omg.CORBA.Any[] elements) throws org.omg.CosCollection.ElementInvalid,org.omg.CosCollection.IteratorInvalid;
	boolean add_element_as_previous_set_iterator(org.omg.CORBA.Any element) throws org.omg.CosCollection.ElementInvalid,org.omg.CosCollection.IteratorInvalid;
	void add_n_elements_as_previous_set_iterator(org.omg.CORBA.Any[] elements) throws org.omg.CosCollection.ElementInvalid,org.omg.CosCollection.IteratorInvalid;
}
