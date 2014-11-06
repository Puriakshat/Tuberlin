package org.omg.dds;

/**
 * Generated from IDL interface "MultiTopic".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class MultiTopicHolder	implements org.omg.CORBA.portable.Streamable{
	 public MultiTopic value;
	public MultiTopicHolder()
	{
	}
	public MultiTopicHolder (final MultiTopic initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return MultiTopicHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = MultiTopicHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		MultiTopicHelper.write (_out,value);
	}
}
