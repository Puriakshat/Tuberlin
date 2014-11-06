package org.omg.CosCollection;


/**
 * Generated from IDL interface "CollectionFactories".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface CollectionFactoriesOperations
	extends org.omg.CosCollection.CollectionFactoryOperations
{
	/* constants */
	/* operations  */
	boolean add_factory(java.lang.String collection_interface, java.lang.String impl_category, java.lang.String impl_interface, org.omg.CosCollection.CollectionFactory factory);
	boolean remove_factory(java.lang.String collection_interface, java.lang.String impl_category, java.lang.String impl_interface);
	org.omg.CosCollection.Collection create(org.omg.CosCollection.NVPair[] parameters) throws org.omg.CosCollection.ParameterInvalid;
}
