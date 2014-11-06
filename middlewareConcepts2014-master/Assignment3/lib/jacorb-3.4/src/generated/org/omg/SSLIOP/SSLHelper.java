package org.omg.SSLIOP;


/**
 * Generated from IDL struct "SSL".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class SSLHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(SSLHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.SSLIOP.SSLHelper.id(),"SSL",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("target_supports", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.Security.AssociationOptionsHelper.id(), "AssociationOptions",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(4))), null),new org.omg.CORBA.StructMember("target_requires", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.Security.AssociationOptionsHelper.id(), "AssociationOptions",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(4))), null),new org.omg.CORBA.StructMember("port", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(4)), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.SSLIOP.SSL s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.SSLIOP.SSL extract (final org.omg.CORBA.Any any)
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
		return "IDL:omg.org/SSLIOP/SSL:1.0";
	}
	public static org.omg.SSLIOP.SSL read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.SSLIOP.SSL result = new org.omg.SSLIOP.SSL();
		result.target_supports=in.read_ushort();
		result.target_requires=in.read_ushort();
		result.port=in.read_ushort();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.SSLIOP.SSL s)
	{
		out.write_ushort(s.target_supports);
		out.write_ushort(s.target_requires);
		out.write_ushort(s.port);
	}
}
