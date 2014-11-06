package org.omg.CONV_FRAME;


/**
 * Generated from IDL struct "CodeSetComponent".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class CodeSetComponentHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(CodeSetComponentHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CONV_FRAME.CodeSetComponentHelper.id(),"CodeSetComponent",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("native_code_set", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CONV_FRAME.CodeSetIdHelper.id(), "CodeSetId",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5))), null),new org.omg.CORBA.StructMember("conversion_code_sets", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CONV_FRAME.CodeSetIdSeqHelper.id(), "CodeSetIdSeq",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CONV_FRAME.CodeSetIdHelper.type())), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CONV_FRAME.CodeSetComponent s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CONV_FRAME.CodeSetComponent extract (final org.omg.CORBA.Any any)
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
		return "IDL:omg.org/CONV_FRAME/CodeSetComponent:1.0";
	}
	public static org.omg.CONV_FRAME.CodeSetComponent read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CONV_FRAME.CodeSetComponent result = new org.omg.CONV_FRAME.CodeSetComponent();
		result.native_code_set=in.read_ulong();
		result.conversion_code_sets = org.omg.CONV_FRAME.CodeSetIdSeqHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CONV_FRAME.CodeSetComponent s)
	{
		out.write_ulong(s.native_code_set);
		org.omg.CONV_FRAME.CodeSetIdSeqHelper.write(out,s.conversion_code_sets);
	}
}
