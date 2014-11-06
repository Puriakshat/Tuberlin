package org.omg.CORBA;


/**
 * Generated from IDL struct "ServiceInformation".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class ServiceInformationHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(ServiceInformationHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CORBA.ServiceInformationHelper.id(),"ServiceInformation",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("service_options", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.ServiceOptionSeqHelper.id(), "ServiceOptionSeq",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ServiceOptionHelper.type())), null),new org.omg.CORBA.StructMember("service_details", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.ServiceDetailSeqHelper.id(), "ServiceDetailSeq",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CORBA.ServiceDetailHelper.id(),"ServiceDetail",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("service_detail_type", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.ServiceDetailTypeHelper.id(), "ServiceDetailType",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5))), null),new org.omg.CORBA.StructMember("service_detail", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.ServiceDetailDataHelper.id(), "ServiceDetailData",org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.OctetSeqHelper.id(), "OctetSeq",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(10))))), null)}))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CORBA.ServiceInformation s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CORBA.ServiceInformation extract (final org.omg.CORBA.Any any)
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
		return "IDL:omg.org/CORBA/ServiceInformation:1.0";
	}
	public static org.omg.CORBA.ServiceInformation read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CORBA.ServiceInformation result = new org.omg.CORBA.ServiceInformation();
		result.service_options = org.omg.CORBA.ServiceOptionSeqHelper.read(in);
		result.service_details = org.omg.CORBA.ServiceDetailSeqHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CORBA.ServiceInformation s)
	{
		org.omg.CORBA.ServiceOptionSeqHelper.write(out,s.service_options);
		org.omg.CORBA.ServiceDetailSeqHelper.write(out,s.service_details);
	}
}
