package org.omg.RTCORBA;


/**
 * Generated from IDL interface "Mutex".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface MutexOperations
{
	/* constants */
	/* operations  */
	void lock();
	void unlock();
	boolean try_lock(long max_wait);
}
