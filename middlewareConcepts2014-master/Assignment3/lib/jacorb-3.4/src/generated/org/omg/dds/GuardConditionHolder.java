package org.omg.dds;

/**
 * Generated from IDL interface "GuardCondition".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class GuardConditionHolder	implements org.omg.CORBA.portable.Streamable{
	 public GuardCondition value;
	public GuardConditionHolder()
	{
	}
	public GuardConditionHolder (final GuardCondition initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return GuardConditionHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = GuardConditionHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		GuardConditionHelper.write (_out,value);
	}
}
