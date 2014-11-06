package d.client;


/**
 * Generated from IDL struct "Quote".
 *
 * @author JacORB IDL compiler V 3.4
 * @version generated at 02-Jun-2014 09:21:34
 */

public abstract class QuoteHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(QuoteHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(QuoteHelper.id(),"Quote",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("id", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("price", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final Quote s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static Quote extract (final org.omg.CORBA.Any any)
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
		return "IDL:StockExchange/Quote:1.0";
	}
	public static Quote read (final org.omg.CORBA.portable.InputStream in)
	{
		Quote result = new Quote();
		result.name=in.read_string();
		result.id=in.read_string();
		result.price=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final Quote s)
	{
		java.lang.String tmpResult0 = s.name;
out.write_string( tmpResult0 );
		java.lang.String tmpResult1 = s.id;
out.write_string( tmpResult1 );
		java.lang.String tmpResult2 = s.price;
out.write_string( tmpResult2 );
	}
}
