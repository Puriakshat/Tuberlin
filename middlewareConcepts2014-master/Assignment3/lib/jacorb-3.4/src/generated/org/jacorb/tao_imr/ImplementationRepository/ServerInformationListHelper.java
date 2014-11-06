package org.jacorb.tao_imr.ImplementationRepository;

/**
 * Generated from IDL alias "ServerInformationList".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class ServerInformationListHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;

	public static void insert (org.omg.CORBA.Any any, org.jacorb.tao_imr.ImplementationRepository.ServerInformation[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.jacorb.tao_imr.ImplementationRepository.ServerInformation[] extract (final org.omg.CORBA.Any any)
	{
		if ( any.type().kind() == org.omg.CORBA.TCKind.tk_null)
		{
			throw new org.omg.CORBA.BAD_OPERATION ("Can't extract from Any with null type.");
		}
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(ServerInformationListHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_alias_tc(org.jacorb.tao_imr.ImplementationRepository.ServerInformationListHelper.id(), "ServerInformationList",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(org.jacorb.tao_imr.ImplementationRepository.ServerInformationHelper.id(),"ServerInformation",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("server", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("startup", org.omg.CORBA.ORB.init().create_struct_tc(org.jacorb.tao_imr.ImplementationRepository.StartupOptionsHelper.id(),"StartupOptions",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("command_line", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("environment", org.omg.CORBA.ORB.init().create_alias_tc(org.jacorb.tao_imr.ImplementationRepository.EnvironmentListHelper.id(), "EnvironmentList",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(org.jacorb.tao_imr.ImplementationRepository.EnvironmentVariableHelper.id(),"EnvironmentVariable",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null),new org.omg.CORBA.StructMember("working_directory", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("activation", org.omg.CORBA.ORB.init().create_enum_tc(org.jacorb.tao_imr.ImplementationRepository.ActivationModeHelper.id(),"ActivationMode",new String[]{"NORMAL","MANUAL","PER_CLIENT","AUTO_START"}), null),new org.omg.CORBA.StructMember("activator", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("start_limit", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null)}), null),new org.omg.CORBA.StructMember("partial_ior", org.omg.CORBA.ORB.init().create_string_tc(0), null)})));
				}
			}
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:ImplementationRepository/ServerInformationList:1.0";
	}
	public static org.jacorb.tao_imr.ImplementationRepository.ServerInformation[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.jacorb.tao_imr.ImplementationRepository.ServerInformation[] _result;
		int _l_result165 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result165 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result165);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new org.jacorb.tao_imr.ImplementationRepository.ServerInformation[_l_result165];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=org.jacorb.tao_imr.ImplementationRepository.ServerInformationHelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.jacorb.tao_imr.ImplementationRepository.ServerInformation[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			org.jacorb.tao_imr.ImplementationRepository.ServerInformationHelper.write(_out,_s[i]);
		}

	}
}
