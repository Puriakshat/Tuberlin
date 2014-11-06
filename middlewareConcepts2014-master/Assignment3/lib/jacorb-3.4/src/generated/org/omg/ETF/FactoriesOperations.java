package org.omg.ETF;


/**
 * Generated from IDL interface "Factories".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface FactoriesOperations
{
	/* constants */
	/* operations  */
	org.omg.ETF.Connection create_connection(org.omg.RTCORBA.ProtocolProperties props);
	org.omg.ETF.Listener create_listener(org.omg.RTCORBA.ProtocolProperties props, int stacksize, short base_priority);
	org.omg.ETF.Profile demarshal_profile(org.omg.IOP.TaggedProfileHolder tagged_profile, org.omg.IOP.TaggedComponentSeqHolder components);
	org.omg.ETF.Profile decode_corbaloc(java.lang.String corbaloc);
	int profile_tag();
}
