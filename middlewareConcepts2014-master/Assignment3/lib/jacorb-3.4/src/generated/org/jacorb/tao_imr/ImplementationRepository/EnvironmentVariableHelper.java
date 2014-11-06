package org.jacorb.tao_imr.ImplementationRepository;


/**
 * Generated from IDL struct "EnvironmentVariable".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class EnvironmentVariableHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(EnvironmentVariableHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(org.jacorb.tao_imr.ImplementationRepository.EnvironmentVariableHelper.id(),"EnvironmentVariable",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.jacorb.tao_imr.ImplementationRepository.EnvironmentVariable s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.jacorb.tao_imr.ImplementationRepository.EnvironmentVariable extract (final org.omg.CORBA.Any any)
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
		return "IDL:ImplementationRepository/EnvironmentVariable:1.0";
	}
	public static org.jacorb.tao_imr.ImplementationRepository.EnvironmentVariable read (final org.omg.CORBA.portable.InputStream in)
	{
		org.jacorb.tao_imr.ImplementationRepository.EnvironmentVariable result = new org.jacorb.tao_imr.ImplementationRepository.EnvironmentVariable();
		result.name=in.read_string();
		result.value=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.jacorb.tao_imr.ImplementationRepository.EnvironmentVariable s)
	{
		java.lang.String tmpResult1261 = s.name;
out.write_string( tmpResult1261 );
		java.lang.String tmpResult1262 = s.value;
out.write_string( tmpResult1262 );
	}
}
