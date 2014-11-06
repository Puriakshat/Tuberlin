package org.omg.GIOP;


/**
 * Generated from IDL struct "RequestHeader_1_2".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class RequestHeader_1_2Helper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(RequestHeader_1_2Helper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.GIOP.RequestHeader_1_2Helper.id(),"RequestHeader_1_2",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("request_id", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("response_flags", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(10)), null),new org.omg.CORBA.StructMember("reserved", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.GIOP.RequestReservedHelper.id(), "RequestReserved",org.omg.CORBA.ORB.init().create_array_tc(3,org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(10)))), null),new org.omg.CORBA.StructMember("target", org.omg.GIOP.TargetAddressHelper.type(), null),new org.omg.CORBA.StructMember("operation", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("service_context", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.IOP.ServiceContextListHelper.id(), "ServiceContextList",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(org.omg.IOP.ServiceContextHelper.id(),"ServiceContext",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("context_id", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.IOP.ServiceIdHelper.id(), "ServiceId",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5))), null),new org.omg.CORBA.StructMember("context_data", org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(10))), null)}))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.GIOP.RequestHeader_1_2 s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.GIOP.RequestHeader_1_2 extract (final org.omg.CORBA.Any any)
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
		return "IDL:omg.org/GIOP/RequestHeader_1_2:1.0";
	}
	public static org.omg.GIOP.RequestHeader_1_2 read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.GIOP.RequestHeader_1_2 result = new org.omg.GIOP.RequestHeader_1_2();
		result.request_id=in.read_ulong();
		result.response_flags=in.read_octet();
		result.reserved = org.omg.GIOP.RequestReservedHelper.read(in);
		result.target=org.omg.GIOP.TargetAddressHelper.read(in);
		result.operation=in.read_string();
		result.service_context = org.omg.IOP.ServiceContextListHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.GIOP.RequestHeader_1_2 s)
	{
		out.write_ulong(s.request_id);
		out.write_octet(s.response_flags);
		org.omg.GIOP.RequestReservedHelper.write(out,s.reserved);
		org.omg.GIOP.TargetAddressHelper.write(out,s.target);
		java.lang.String tmpResult985 = s.operation;
out.write_string( tmpResult985 );
		org.omg.IOP.ServiceContextListHelper.write(out,s.service_context);
	}
}
