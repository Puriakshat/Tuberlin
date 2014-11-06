package org.omg.PortableInterceptor.ORBInitInfoPackage;


/**
 * Generated from IDL exception "DuplicateName".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class DuplicateNameHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(DuplicateNameHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_exception_tc(org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateNameHelper.id(),"DuplicateName",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateName s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateName extract (final org.omg.CORBA.Any any)
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
		return "IDL:omg.org/PortableInterceptor/ORBInitInfo/DuplicateName:1.0";
	}
	public static org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateName read (final org.omg.CORBA.portable.InputStream in)
	{
		String id = in.read_string();
		if (!id.equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id: " + id);
		java.lang.String x0;
		x0=in.read_string();
		final org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateName result = new org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateName(id, x0);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateName s)
	{
		out.write_string(id());
		java.lang.String tmpResult992 = s.name;
out.write_string( tmpResult992 );
	}
}
