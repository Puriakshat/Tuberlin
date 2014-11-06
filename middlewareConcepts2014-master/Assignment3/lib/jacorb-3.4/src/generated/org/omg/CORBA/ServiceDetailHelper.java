package org.omg.CORBA;


/**
 * Generated from IDL struct "ServiceDetail".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class ServiceDetailHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(ServiceDetailHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CORBA.ServiceDetailHelper.id(),"ServiceDetail",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("service_detail_type", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.ServiceDetailTypeHelper.id(), "ServiceDetailType",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5))), null),new org.omg.CORBA.StructMember("service_detail", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.ServiceDetailDataHelper.id(), "ServiceDetailData",org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.OctetSeqHelper.id(), "OctetSeq",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(10))))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CORBA.ServiceDetail s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CORBA.ServiceDetail extract (final org.omg.CORBA.Any any)
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
		return "IDL:omg.org/CORBA/ServiceDetail:1.0";
	}
	public static org.omg.CORBA.ServiceDetail read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CORBA.ServiceDetail result = new org.omg.CORBA.ServiceDetail();
		result.service_detail_type=in.read_ulong();
		result.service_detail = org.omg.CORBA.OctetSeqHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CORBA.ServiceDetail s)
	{
		out.write_ulong(s.service_detail_type);
		org.omg.CORBA.OctetSeqHelper.write(out,s.service_detail);
	}
}
