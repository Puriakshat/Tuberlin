package org.omg.CORBA;
/**
 * Generated from IDL enum "exception_type".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class exception_typeHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(exception_typeHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.CORBA.exception_typeHelper.id(),"exception_type",new String[]{"NO_EXCEPTION","USER_EXCEPTION","SYSTEM_EXCEPTION"});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CORBA.exception_type s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CORBA.exception_type extract (final org.omg.CORBA.Any any)
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
		return "IDL:omg.org/CORBA/exception_type:1.0";
	}
	public static exception_type read (final org.omg.CORBA.portable.InputStream in)
	{
		return exception_type.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final exception_type s)
	{
		out.write_long(s.value());
	}
}
