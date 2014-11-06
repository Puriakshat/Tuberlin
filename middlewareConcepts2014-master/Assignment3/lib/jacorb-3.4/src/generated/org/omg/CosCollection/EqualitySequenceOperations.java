package org.omg.CosCollection;


/**
 * Generated from IDL interface "EqualitySequence".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface EqualitySequenceOperations
	extends org.omg.CosCollection.EqualitySequentialCollectionOperations
{
	/* constants */
	/* operations  */
	boolean equal(org.omg.CosCollection.EqualitySequence collector);
	boolean not_equal(org.omg.CosCollection.EqualitySequence collector);
	int compare(org.omg.CosCollection.EqualitySequence collector, org.omg.CosCollection.Comparator comparison);
}
