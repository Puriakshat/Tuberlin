package org.omg.GIOP;


/**
 * Generated from IDL struct "MessageHeader_1_0".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class MessageHeader_1_0Helper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(MessageHeader_1_0Helper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.GIOP.MessageHeader_1_0Helper.id(),"MessageHeader_1_0",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("magic", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.GIOP.MagicnHelper.id(), "Magicn",org.omg.CORBA.ORB.init().create_array_tc(4,org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(9)))), null),new org.omg.CORBA.StructMember("GIOP_version", org.omg.CORBA.ORB.init().create_struct_tc(org.omg.GIOP.VersionHelper.id(),"Version",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("major", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(10)), null),new org.omg.CORBA.StructMember("minor", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(10)), null)}), null),new org.omg.CORBA.StructMember("byte_order", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("message_type", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(10)), null),new org.omg.CORBA.StructMember("message_size", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.GIOP.MessageHeader_1_0 s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.GIOP.MessageHeader_1_0 extract (final org.omg.CORBA.Any any)
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
		return "IDL:omg.org/GIOP/MessageHeader_1_0:1.0";
	}
	public static org.omg.GIOP.MessageHeader_1_0 read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.GIOP.MessageHeader_1_0 result = new org.omg.GIOP.MessageHeader_1_0();
		result.magic = org.omg.GIOP.MagicnHelper.read(in);
		result.GIOP_version=org.omg.GIOP.VersionHelper.read(in);
		result.byte_order=in.read_boolean();
		result.message_type=in.read_octet();
		result.message_size=in.read_ulong();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.GIOP.MessageHeader_1_0 s)
	{
		org.omg.GIOP.MagicnHelper.write(out,s.magic);
		org.omg.GIOP.VersionHelper.write(out,s.GIOP_version);
		out.write_boolean(s.byte_order);
		out.write_octet(s.message_type);
		out.write_ulong(s.message_size);
	}
}
