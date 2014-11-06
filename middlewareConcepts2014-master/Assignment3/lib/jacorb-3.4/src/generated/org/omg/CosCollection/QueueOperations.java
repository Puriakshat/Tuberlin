package org.omg.CosCollection;


/**
 * Generated from IDL interface "Queue".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface QueueOperations
	extends org.omg.CosCollection.RestrictedAccessCollectionOperations
{
	/* constants */
	/* operations  */
	void enqueue(org.omg.CORBA.Any element) throws org.omg.CosCollection.ElementInvalid;
	void dequeue() throws org.omg.CosCollection.EmptyCollection;
	boolean element_dequeue(org.omg.CORBA.AnyHolder element) throws org.omg.CosCollection.EmptyCollection;
}
