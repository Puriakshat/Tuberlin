package org.jacorb.sasPolicy;

/**
 * Generated from IDL struct "SASPolicyValues".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class SASPolicyValuesHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.jacorb.sasPolicy.SASPolicyValues value;

	public SASPolicyValuesHolder ()
	{
	}
	public SASPolicyValuesHolder(final org.jacorb.sasPolicy.SASPolicyValues initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.jacorb.sasPolicy.SASPolicyValuesHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.jacorb.sasPolicy.SASPolicyValuesHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.jacorb.sasPolicy.SASPolicyValuesHelper.write(_out, value);
	}
}
