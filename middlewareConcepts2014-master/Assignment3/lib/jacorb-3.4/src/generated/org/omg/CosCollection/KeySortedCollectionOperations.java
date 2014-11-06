package org.omg.CosCollection;


/**
 * Generated from IDL interface "KeySortedCollection".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface KeySortedCollectionOperations
	extends org.omg.CosCollection.KeyCollectionOperations , org.omg.CosCollection.SortedCollectionOperations
{
	/* constants */
	/* operations  */
	boolean locate_first_element_with_key(org.omg.CORBA.Any key, org.omg.CosCollection.Iterator where) throws org.omg.CosCollection.KeyInvalid,org.omg.CosCollection.IteratorInvalid;
	boolean locate_last_element_with_key(org.omg.CORBA.Any key, org.omg.CosCollection.Iterator where) throws org.omg.CosCollection.KeyInvalid,org.omg.CosCollection.IteratorInvalid;
	boolean locate_previous_element_with_key(org.omg.CORBA.Any key, org.omg.CosCollection.Iterator where) throws org.omg.CosCollection.KeyInvalid,org.omg.CosCollection.IteratorInvalid;
	boolean locate_previous_element_with_different_key(org.omg.CosCollection.Iterator where) throws org.omg.CosCollection.IteratorInvalid,org.omg.CosCollection.IteratorInBetween;
}
