package org.omg.PortableInterceptor;


/**
 * Generated from IDL interface "Current".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface CurrentOperations
	extends org.omg.CORBA.CurrentOperations
{
	/* constants */
	/* operations  */
	org.omg.CORBA.Any get_slot(int id) throws org.omg.PortableInterceptor.InvalidSlot;
	void set_slot(int id, org.omg.CORBA.Any data) throws org.omg.PortableInterceptor.InvalidSlot;
}
