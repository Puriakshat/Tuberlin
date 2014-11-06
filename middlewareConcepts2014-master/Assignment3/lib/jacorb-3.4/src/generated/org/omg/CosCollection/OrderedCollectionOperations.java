package org.omg.CosCollection;


/**
 * Generated from IDL interface "OrderedCollection".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface OrderedCollectionOperations
	extends org.omg.CosCollection.CollectionOperations
{
	/* constants */
	/* operations  */
	void remove_element_at_position(int position) throws org.omg.CosCollection.PositionInvalid;
	void remove_first_element() throws org.omg.CosCollection.EmptyCollection;
	void remove_last_element() throws org.omg.CosCollection.EmptyCollection;
	boolean retrieve_element_at_position(int position, org.omg.CORBA.AnyHolder element) throws org.omg.CosCollection.PositionInvalid;
	boolean retrieve_first_element(org.omg.CORBA.AnyHolder element) throws org.omg.CosCollection.EmptyCollection;
	boolean retrieve_last_element(org.omg.CORBA.AnyHolder element) throws org.omg.CosCollection.EmptyCollection;
	org.omg.CosCollection.OrderedIterator create_ordered_iterator(boolean read_only, boolean reverse_iteration);
}
