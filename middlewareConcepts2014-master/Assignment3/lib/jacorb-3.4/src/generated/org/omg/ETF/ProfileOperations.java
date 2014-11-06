package org.omg.ETF;


/**
 * Generated from IDL interface "Profile".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface ProfileOperations
{
	/* constants */
	/* operations  */
	void marshal(org.omg.IOP.TaggedProfileHolder tagged_profile, org.omg.IOP.TaggedComponentSeqHolder components);
	int hash();
	org.omg.ETF.Profile copy();
	boolean is_match(org.omg.ETF.Profile prof);
	org.omg.GIOP.Version version();
	void set_object_key(byte[] key);
	byte[] get_object_key();
	int tag();
}
