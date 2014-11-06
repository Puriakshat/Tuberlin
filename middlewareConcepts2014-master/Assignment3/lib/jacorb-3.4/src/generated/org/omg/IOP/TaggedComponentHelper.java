package org.omg.IOP;


/**
 * Generated from IDL struct "TaggedComponent".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class TaggedComponentHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(TaggedComponentHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.IOP.TaggedComponentHelper.id(),"TaggedComponent",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("tag", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.IOP.ComponentIdHelper.id(), "ComponentId",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5))), null),new org.omg.CORBA.StructMember("component_data", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.IOP.ComponentDataHelper.id(), "ComponentData",org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.OctetSeqHelper.id(), "OctetSeq",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(10))))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.IOP.TaggedComponent s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.IOP.TaggedComponent extract (final org.omg.CORBA.Any any)
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
		return "IDL:omg.org/IOP/TaggedComponent:1.0";
	}
	public static org.omg.IOP.TaggedComponent read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.IOP.TaggedComponent result = new org.omg.IOP.TaggedComponent();
		result.tag=in.read_ulong();
		result.component_data = org.omg.CORBA.OctetSeqHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.IOP.TaggedComponent s)
	{
		out.write_ulong(s.tag);
		org.omg.CORBA.OctetSeqHelper.write(out,s.component_data);
	}
}
