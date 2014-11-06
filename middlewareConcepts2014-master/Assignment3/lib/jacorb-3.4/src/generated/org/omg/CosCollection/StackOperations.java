package org.omg.CosCollection;


/**
 * Generated from IDL interface "Stack".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface StackOperations
	extends org.omg.CosCollection.RestrictedAccessCollectionOperations
{
	/* constants */
	/* operations  */
	void push(org.omg.CORBA.Any element) throws org.omg.CosCollection.ElementInvalid;
	void pop() throws org.omg.CosCollection.EmptyCollection;
	boolean element_pop(org.omg.CORBA.AnyHolder element) throws org.omg.CosCollection.EmptyCollection;
	boolean top(org.omg.CORBA.AnyHolder element) throws org.omg.CosCollection.EmptyCollection;
}
