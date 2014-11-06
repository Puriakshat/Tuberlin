package org.omg.CosEventComm;


/**
 * Generated from IDL interface "PushConsumer".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface PushConsumerOperations
{
	/* constants */
	/* operations  */
	void push(org.omg.CORBA.Any data) throws org.omg.CosEventComm.Disconnected;
	void disconnect_push_consumer();
}
