package org.omg.CosTime;


/**
 * Generated from IDL interface "TIO".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface TIOOperations
{
	/* constants */
	/* operations  */
	org.omg.TimeBase.IntervalT time_interval();
	org.omg.CosTime.OverlapType spans(org.omg.CosTime.UTO time, org.omg.CosTime.TIOHolder overlap);
	org.omg.CosTime.OverlapType overlaps(org.omg.CosTime.TIO interval, org.omg.CosTime.TIOHolder overlap);
	org.omg.CosTime.UTO time();
}
