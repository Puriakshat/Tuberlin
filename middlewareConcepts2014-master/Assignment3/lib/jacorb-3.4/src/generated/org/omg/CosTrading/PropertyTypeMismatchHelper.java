package org.omg.CosTrading;


/**
 * Generated from IDL exception "PropertyTypeMismatch".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class PropertyTypeMismatchHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(PropertyTypeMismatchHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_exception_tc(org.omg.CosTrading.PropertyTypeMismatchHelper.id(),"PropertyTypeMismatch",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("type", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CosTrading.ServiceTypeNameHelper.id(), "ServiceTypeName",org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CosTrading.IstringHelper.id(), "Istring",org.omg.CORBA.ORB.init().create_string_tc(0))), null),new org.omg.CORBA.StructMember("prop", org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CosTrading.PropertyHelper.id(),"Property",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CosTrading.PropertyNameHelper.id(), "PropertyName",org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CosTrading.IstringHelper.id(), "Istring",org.omg.CORBA.ORB.init().create_string_tc(0))), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CosTrading.PropertyValueHelper.id(), "PropertyValue",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(11))), null)}), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTrading.PropertyTypeMismatch s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosTrading.PropertyTypeMismatch extract (final org.omg.CORBA.Any any)
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
		return "IDL:omg.org/CosTrading/PropertyTypeMismatch:1.0";
	}
	public static org.omg.CosTrading.PropertyTypeMismatch read (final org.omg.CORBA.portable.InputStream in)
	{
		String id = in.read_string();
		if (!id.equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id: " + id);
		java.lang.String x0;
		x0=in.read_string();
		org.omg.CosTrading.Property x1;
		x1=org.omg.CosTrading.PropertyHelper.read(in);
		final org.omg.CosTrading.PropertyTypeMismatch result = new org.omg.CosTrading.PropertyTypeMismatch(id, x0, x1);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosTrading.PropertyTypeMismatch s)
	{
		out.write_string(id());
		java.lang.String tmpResult1047 = s.type;
out.write_string( tmpResult1047 );
		org.omg.CosTrading.PropertyHelper.write(out,s.prop);
	}
}
