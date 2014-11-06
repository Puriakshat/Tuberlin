package org.jacorb.tao_imr.ImplementationRepository;


/**
 * Generated from IDL struct "StartupInfo".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class StartupInfoHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(StartupInfoHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(org.jacorb.tao_imr.ImplementationRepository.StartupInfoHelper.id(),"StartupInfo",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("partial_ior", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("ior", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.jacorb.tao_imr.ImplementationRepository.StartupInfo s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.jacorb.tao_imr.ImplementationRepository.StartupInfo extract (final org.omg.CORBA.Any any)
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
		return "IDL:ImplementationRepository/StartupInfo:1.0";
	}
	public static org.jacorb.tao_imr.ImplementationRepository.StartupInfo read (final org.omg.CORBA.portable.InputStream in)
	{
		org.jacorb.tao_imr.ImplementationRepository.StartupInfo result = new org.jacorb.tao_imr.ImplementationRepository.StartupInfo();
		result.name=in.read_string();
		result.partial_ior=in.read_string();
		result.ior=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.jacorb.tao_imr.ImplementationRepository.StartupInfo s)
	{
		java.lang.String tmpResult1242 = s.name;
out.write_string( tmpResult1242 );
		java.lang.String tmpResult1243 = s.partial_ior;
out.write_string( tmpResult1243 );
		java.lang.String tmpResult1244 = s.ior;
out.write_string( tmpResult1244 );
	}
}
