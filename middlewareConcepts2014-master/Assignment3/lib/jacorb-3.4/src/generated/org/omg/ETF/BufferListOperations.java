package org.omg.ETF;


/**
 * Generated from IDL interface "BufferList".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface BufferListOperations
{
	/* constants */
	/* operations  */
	int add_buffer(int size, org.omg.ETF.BufferHolder buf);
	int num_buffers();
	void get_buffer(int index, org.omg.ETF.BufferHolder buf);
	void release_buffers();
}
