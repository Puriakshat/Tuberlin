package org.omg.GIOP;


/**
 * Generated from IDL struct "LocateRequestHeader_1_0".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class LocateRequestHeader_1_0Helper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(LocateRequestHeader_1_0Helper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.GIOP.LocateRequestHeader_1_0Helper.id(),"LocateRequestHeader_1_0",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("request_id", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("object_key", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.IOP.ObjectKeyHelper.id(), "ObjectKey",org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.OctetSeqHelper.id(), "OctetSeq",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(10))))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.GIOP.LocateRequestHeader_1_0 s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.GIOP.LocateRequestHeader_1_0 extract (final org.omg.CORBA.Any any)
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
		return "IDL:omg.org/GIOP/LocateRequestHeader_1_0:1.0";
	}
	public static org.omg.GIOP.LocateRequestHeader_1_0 read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.GIOP.LocateRequestHeader_1_0 result = new org.omg.GIOP.LocateRequestHeader_1_0();
		result.request_id=in.read_ulong();
		result.object_key = org.omg.CORBA.OctetSeqHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.GIOP.LocateRequestHeader_1_0 s)
	{
		out.write_ulong(s.request_id);
		org.omg.CORBA.OctetSeqHelper.write(out,s.object_key);
	}
}
