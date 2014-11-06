package org.omg.CORBA;

/**
 * Generated from IDL abstract value type "Pollable".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */


public interface Pollable
	extends org.omg.CORBA.portable.ValueBase 
{
	/* operations  */
	boolean is_ready(int timeout);
	org.omg.CORBA.PollableSet create_pollable_set();
}
