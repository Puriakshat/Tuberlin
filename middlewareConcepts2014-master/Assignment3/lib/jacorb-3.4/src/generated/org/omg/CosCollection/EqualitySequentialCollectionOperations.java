package org.omg.CosCollection;


/**
 * Generated from IDL interface "EqualitySequentialCollection".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface EqualitySequentialCollectionOperations
	extends org.omg.CosCollection.EqualityCollectionOperations , org.omg.CosCollection.SequentialCollectionOperations
{
	/* constants */
	/* operations  */
	boolean locate_first_element_with_value(org.omg.CORBA.Any element, org.omg.CosCollection.Iterator where) throws org.omg.CosCollection.ElementInvalid,org.omg.CosCollection.IteratorInvalid;
	boolean locate_last_element_with_value(org.omg.CORBA.Any element, org.omg.CosCollection.Iterator where) throws org.omg.CosCollection.ElementInvalid,org.omg.CosCollection.IteratorInvalid;
	boolean locate_previous_element_with_value(org.omg.CORBA.Any element, org.omg.CosCollection.Iterator where) throws org.omg.CosCollection.ElementInvalid,org.omg.CosCollection.IteratorInvalid;
}
