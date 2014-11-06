package org.omg.CosCollection;


/**
 * Generated from IDL interface "SequentialCollection".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface SequentialCollectionOperations
	extends org.omg.CosCollection.OrderedCollectionOperations
{
	/* constants */
	/* operations  */
	void add_element_as_first(org.omg.CORBA.Any element) throws org.omg.CosCollection.ElementInvalid;
	void add_element_as_first_set_iterator(org.omg.CORBA.Any element, org.omg.CosCollection.Iterator where) throws org.omg.CosCollection.ElementInvalid,org.omg.CosCollection.IteratorInvalid;
	void add_element_as_last(org.omg.CORBA.Any element) throws org.omg.CosCollection.ElementInvalid;
	void add_element_as_last_set_iterator(org.omg.CORBA.Any element, org.omg.CosCollection.Iterator where) throws org.omg.CosCollection.ElementInvalid,org.omg.CosCollection.IteratorInvalid;
	void add_element_as_next(org.omg.CORBA.Any element, org.omg.CosCollection.Iterator where) throws org.omg.CosCollection.ElementInvalid,org.omg.CosCollection.IteratorInvalid;
	void add_element_as_previous(org.omg.CORBA.Any element, org.omg.CosCollection.Iterator where) throws org.omg.CosCollection.ElementInvalid,org.omg.CosCollection.IteratorInvalid;
	void add_element_at_position(int position, org.omg.CORBA.Any element) throws org.omg.CosCollection.PositionInvalid,org.omg.CosCollection.ElementInvalid;
	void add_element_at_position_set_iterator(int position, org.omg.CORBA.Any element, org.omg.CosCollection.Iterator where) throws org.omg.CosCollection.PositionInvalid,org.omg.CosCollection.ElementInvalid,org.omg.CosCollection.IteratorInvalid;
	void replace_element_at_position(int position, org.omg.CORBA.Any element) throws org.omg.CosCollection.PositionInvalid,org.omg.CosCollection.ElementInvalid;
	void replace_first_element(org.omg.CORBA.Any element) throws org.omg.CosCollection.EmptyCollection,org.omg.CosCollection.ElementInvalid;
	void replace_last_element(org.omg.CORBA.Any element) throws org.omg.CosCollection.EmptyCollection,org.omg.CosCollection.ElementInvalid;
	void sort(org.omg.CosCollection.Comparator comparison);
	void reverse();
}
