package org.omg.Messaging;

/**
 * Generated from IDL abstract value type "Poller".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */


public interface Poller
	extends org.omg.CORBA.portable.ValueBase , org.omg.CORBA.Pollable
{
	/* operations  */
	org.omg.CORBA.Object operation_target();
	java.lang.String operation_name();
	org.omg.Messaging.ReplyHandler associated_handler();
	void associated_handler(org.omg.Messaging.ReplyHandler arg);
	boolean is_from_poller();
}
