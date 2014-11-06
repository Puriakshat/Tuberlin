package org.omg.CosNotification;


/**
 * Generated from IDL struct "FixedEventHeader".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class FixedEventHeaderHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(FixedEventHeaderHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CosNotification.FixedEventHeaderHelper.id(),"FixedEventHeader",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("event_type", org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CosNotification.EventTypeHelper.id(),"EventType",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("domain_name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("type_name", org.omg.CORBA.ORB.init().create_string_tc(0), null)}), null),new org.omg.CORBA.StructMember("event_name", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosNotification.FixedEventHeader s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosNotification.FixedEventHeader extract (final org.omg.CORBA.Any any)
	{
		org.omg.CORBA.portable.InputStream in = any.create_input_stream();
		try
		{
			return read (in);
		}
		finally
		{
			try
			{
				in.close();
			}
			catch (java.io.IOException e)
			{
			throw new RuntimeException("Unexpected exception " + e.toString() );
			}
		}
	}

	public static String id()
	{
		return "IDL:omg.org/CosNotification/FixedEventHeader:1.0";
	}
	public static org.omg.CosNotification.FixedEventHeader read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CosNotification.FixedEventHeader result = new org.omg.CosNotification.FixedEventHeader();
		result.event_type=org.omg.CosNotification.EventTypeHelper.read(in);
		result.event_name=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosNotification.FixedEventHeader s)
	{
		org.omg.CosNotification.EventTypeHelper.write(out,s.event_type);
		java.lang.String tmpResult1149 = s.event_name;
out.write_string( tmpResult1149 );
	}
}
