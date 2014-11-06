package org.omg.IIOP;


/**
 * Generated from IDL struct "ProfileBody_1_1".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class ProfileBody_1_1Helper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(ProfileBody_1_1Helper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.IIOP.ProfileBody_1_1Helper.id(),"ProfileBody_1_1",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("iiop_version", org.omg.CORBA.ORB.init().create_struct_tc(org.omg.IIOP.VersionHelper.id(),"Version",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("major", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(10)), null),new org.omg.CORBA.StructMember("minor", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(10)), null)}), null),new org.omg.CORBA.StructMember("host", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("port", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(4)), null),new org.omg.CORBA.StructMember("object_key", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.IOP.ObjectKeyHelper.id(), "ObjectKey",org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.OctetSeqHelper.id(), "OctetSeq",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(10))))), null),new org.omg.CORBA.StructMember("components", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.IOP.TaggedComponentSeqHelper.id(), "TaggedComponentSeq",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(org.omg.IOP.TaggedComponentHelper.id(),"TaggedComponent",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("tag", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.IOP.ComponentIdHelper.id(), "ComponentId",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5))), null),new org.omg.CORBA.StructMember("component_data", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.IOP.ComponentDataHelper.id(), "ComponentData",org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.OctetSeqHelper.id(), "OctetSeq",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(10))))), null)}))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.IIOP.ProfileBody_1_1 s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.IIOP.ProfileBody_1_1 extract (final org.omg.CORBA.Any any)
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
		return "IDL:omg.org/IIOP/ProfileBody_1_1:1.0";
	}
	public static org.omg.IIOP.ProfileBody_1_1 read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.IIOP.ProfileBody_1_1 result = new org.omg.IIOP.ProfileBody_1_1();
		result.iiop_version=org.omg.IIOP.VersionHelper.read(in);
		result.host=in.read_string();
		result.port=in.read_ushort();
		result.object_key = org.omg.CORBA.OctetSeqHelper.read(in);
		result.components = org.omg.IOP.TaggedComponentSeqHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.IIOP.ProfileBody_1_1 s)
	{
		org.omg.IIOP.VersionHelper.write(out,s.iiop_version);
		java.lang.String tmpResult1008 = s.host;
out.write_string( tmpResult1008 );
		out.write_ushort(s.port);
		org.omg.CORBA.OctetSeqHelper.write(out,s.object_key);
		org.omg.IOP.TaggedComponentSeqHelper.write(out,s.components);
	}
}
