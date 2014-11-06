package org.jacorb.sasPolicy;

/**
 * Generated from IDL struct "ATLASPolicyValues".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ATLASPolicyValuesHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.jacorb.sasPolicy.ATLASPolicyValues value;

	public ATLASPolicyValuesHolder ()
	{
	}
	public ATLASPolicyValuesHolder(final org.jacorb.sasPolicy.ATLASPolicyValues initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.jacorb.sasPolicy.ATLASPolicyValuesHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.jacorb.sasPolicy.ATLASPolicyValuesHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.jacorb.sasPolicy.ATLASPolicyValuesHelper.write(_out, value);
	}
}
