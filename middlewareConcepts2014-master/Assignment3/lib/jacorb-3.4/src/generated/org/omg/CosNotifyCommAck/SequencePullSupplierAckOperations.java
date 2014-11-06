package org.omg.CosNotifyCommAck;


/**
 * Generated from IDL interface "SequencePullSupplierAck".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface SequencePullSupplierAckOperations
	extends org.omg.CosNotifyComm.SequencePullSupplierOperations
{
	/* constants */
	/* operations  */
	void acknowledge(int[] sequence_numbers);
}
