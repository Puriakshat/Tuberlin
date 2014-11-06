package org.jacorb.tao_imr.ImplementationRepository;


/**
 * Generated from IDL struct "ServerInformation".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class ServerInformationHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(ServerInformationHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(org.jacorb.tao_imr.ImplementationRepository.ServerInformationHelper.id(),"ServerInformation",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("server", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("startup", org.omg.CORBA.ORB.init().create_struct_tc(org.jacorb.tao_imr.ImplementationRepository.StartupOptionsHelper.id(),"StartupOptions",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("command_line", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("environment", org.omg.CORBA.ORB.init().create_alias_tc(org.jacorb.tao_imr.ImplementationRepository.EnvironmentListHelper.id(), "EnvironmentList",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(org.jacorb.tao_imr.ImplementationRepository.EnvironmentVariableHelper.id(),"EnvironmentVariable",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null),new org.omg.CORBA.StructMember("working_directory", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("activation", org.omg.CORBA.ORB.init().create_enum_tc(org.jacorb.tao_imr.ImplementationRepository.ActivationModeHelper.id(),"ActivationMode",new String[]{"NORMAL","MANUAL","PER_CLIENT","AUTO_START"}), null),new org.omg.CORBA.StructMember("activator", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("start_limit", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null)}), null),new org.omg.CORBA.StructMember("partial_ior", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.jacorb.tao_imr.ImplementationRepository.ServerInformation s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.jacorb.tao_imr.ImplementationRepository.ServerInformation extract (final org.omg.CORBA.Any any)
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
		return "IDL:ImplementationRepository/ServerInformation:1.0";
	}
	public static org.jacorb.tao_imr.ImplementationRepository.ServerInformation read (final org.omg.CORBA.portable.InputStream in)
	{
		org.jacorb.tao_imr.ImplementationRepository.ServerInformation result = new org.jacorb.tao_imr.ImplementationRepository.ServerInformation();
		result.server=in.read_string();
		result.startup=org.jacorb.tao_imr.ImplementationRepository.StartupOptionsHelper.read(in);
		result.partial_ior=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.jacorb.tao_imr.ImplementationRepository.ServerInformation s)
	{
		java.lang.String tmpResult1266 = s.server;
out.write_string( tmpResult1266 );
		org.jacorb.tao_imr.ImplementationRepository.StartupOptionsHelper.write(out,s.startup);
		java.lang.String tmpResult1267 = s.partial_ior;
out.write_string( tmpResult1267 );
	}
}
