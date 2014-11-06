package org.omg.dds;

/**
 * Generated from IDL interface "DomainParticipantListener".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class DomainParticipantListenerHolder	implements org.omg.CORBA.portable.Streamable{
	 public DomainParticipantListener value;
	public DomainParticipantListenerHolder()
	{
	}
	public DomainParticipantListenerHolder (final DomainParticipantListener initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return DomainParticipantListenerHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = DomainParticipantListenerHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		DomainParticipantListenerHelper.write (_out,value);
	}
}
