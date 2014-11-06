package org.omg.CosNaming;


/**
 * Generated from IDL interface "BindingIterator".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface BindingIteratorOperations
{
	/* constants */
	/* operations  */
	boolean next_one(org.omg.CosNaming.BindingHolder b);
	boolean next_n(int how_many, org.omg.CosNaming.BindingListHolder bl);
	void destroy();
}
