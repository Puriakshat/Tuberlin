package org.omg.CORBA;

/**
 * Generated from IDL abstract value type "CustomMarshal".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */


public interface CustomMarshal
	extends org.omg.CORBA.portable.ValueBase 
{
	/* operations  */
	void marshal(org.omg.CORBA.DataOutputStream os);
	void unmarshal(org.omg.CORBA.DataInputStream is);
}
