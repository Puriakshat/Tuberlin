package org.omg.CosTime;


/**
 * Generated from IDL interface "UTO".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface UTOOperations
{
	/* constants */
	/* operations  */
	long time();
	long inaccuracy();
	short tdf();
	org.omg.TimeBase.UtcT utc_time();
	org.omg.CosTime.UTO absolute_time();
	org.omg.CosTime.TimeComparison compare_time(org.omg.CosTime.ComparisonType comparison_type, org.omg.CosTime.UTO uto_);
	org.omg.CosTime.TIO time_to_interval(org.omg.CosTime.UTO uto_);
	org.omg.CosTime.TIO interval();
}
