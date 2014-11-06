package org.omg.CORBA;


/**
 * Generated from IDL interface "PollableSet".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface PollableSetOperations
{
	/* constants */
	/* operations  */
	org.omg.CORBA.DIIPollable create_dii_pollable();
	void add_pollable(org.omg.CORBA.Pollable potential);
	org.omg.CORBA.Pollable get_ready_pollable(int timeout) throws org.omg.CORBA.PollableSetPackage.NoPossiblePollable;
	void remove(org.omg.CORBA.Pollable potential) throws org.omg.CORBA.PollableSetPackage.UnknownPollable;
	short number_left();
}
