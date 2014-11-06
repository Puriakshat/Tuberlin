package org.omg.Messaging;


/**
 * Generated from IDL struct "PolicyValue".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class PolicyValueHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(PolicyValueHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.Messaging.PolicyValueHelper.id(),"PolicyValue",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("ptype", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.PolicyTypeHelper.id(), "PolicyType",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5))), null),new org.omg.CORBA.StructMember("pvalue", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.Messaging.PolicyDataHelper.id(), "PolicyData",org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.OctetSeqHelper.id(), "OctetSeq",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(10))))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.Messaging.PolicyValue s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.Messaging.PolicyValue extract (final org.omg.CORBA.Any any)
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
		return "IDL:omg.org/Messaging/PolicyValue:1.0";
	}
	public static org.omg.Messaging.PolicyValue read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.Messaging.PolicyValue result = new org.omg.Messaging.PolicyValue();
		result.ptype=in.read_ulong();
		result.pvalue = org.omg.CORBA.OctetSeqHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.Messaging.PolicyValue s)
	{
		out.write_ulong(s.ptype);
		org.omg.CORBA.OctetSeqHelper.write(out,s.pvalue);
	}
}
