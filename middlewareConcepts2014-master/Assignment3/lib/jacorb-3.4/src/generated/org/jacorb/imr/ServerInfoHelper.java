package org.jacorb.imr;


/**
 * Generated from IDL struct "ServerInfo".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class ServerInfoHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(ServerInfoHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(org.jacorb.imr.ServerInfoHelper.id(),"ServerInfo",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_alias_tc(org.jacorb.imr.LogicalServerNameHelper.id(), "LogicalServerName",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("command", org.omg.CORBA.ORB.init().create_alias_tc(org.jacorb.imr.StartupCommandHelper.id(), "StartupCommand",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("poas", org.omg.CORBA.ORB.init().create_alias_tc(org.jacorb.imr.POAInfoSeqHelper.id(), "POAInfoSeq",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(org.jacorb.imr.POAInfoHelper.id(),"POAInfo",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_alias_tc(org.jacorb.imr.POANameHelper.id(), "POAName",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("host", org.omg.CORBA.ORB.init().create_alias_tc(org.jacorb.imr.HostNameHelper.id(), "HostName",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("port", org.omg.CORBA.ORB.init().create_alias_tc(org.jacorb.imr.PortNumberHelper.id(), "PortNumber",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5))), null),new org.omg.CORBA.StructMember("server", org.omg.CORBA.ORB.init().create_alias_tc(org.jacorb.imr.LogicalServerNameHelper.id(), "LogicalServerName",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("active", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null)}))), null),new org.omg.CORBA.StructMember("host", org.omg.CORBA.ORB.init().create_alias_tc(org.jacorb.imr.HostNameHelper.id(), "HostName",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("active", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("holding", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.jacorb.imr.ServerInfo s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.jacorb.imr.ServerInfo extract (final org.omg.CORBA.Any any)
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
		return "IDL:org/jacorb/imr/ServerInfo:1.0";
	}
	public static org.jacorb.imr.ServerInfo read (final org.omg.CORBA.portable.InputStream in)
	{
		org.jacorb.imr.ServerInfo result = new org.jacorb.imr.ServerInfo();
		result.name=in.read_string();
		result.command=in.read_string();
		result.poas = org.jacorb.imr.POAInfoSeqHelper.read(in);
		result.host=in.read_string();
		result.active=in.read_boolean();
		result.holding=in.read_boolean();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.jacorb.imr.ServerInfo s)
	{
		java.lang.String tmpResult1196 = s.name;
out.write_string( tmpResult1196 );
		java.lang.String tmpResult1197 = s.command;
out.write_string( tmpResult1197 );
		org.jacorb.imr.POAInfoSeqHelper.write(out,s.poas);
		java.lang.String tmpResult1198 = s.host;
out.write_string( tmpResult1198 );
		out.write_boolean(s.active);
		out.write_boolean(s.holding);
	}
}
