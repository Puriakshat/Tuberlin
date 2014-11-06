package QuoterPackage;


/**
 * Generated from IDL exception "Invalid_Stock".
 *
 * @author JacORB IDL compiler V 3.4
 * @version generated at 02-Jun-2014 09:21:34
 */

public abstract class Invalid_StockHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(Invalid_StockHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_exception_tc(Invalid_StockHelper.id(),"Invalid_Stock",new org.omg.CORBA.StructMember[0]);
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final Invalid_Stock s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static Invalid_Stock extract (final org.omg.CORBA.Any any)
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
		return "IDL:StockExchange/Invalid_Stock:1.0";
	}
	public static Invalid_Stock read (final org.omg.CORBA.portable.InputStream in)
	{
		String id = in.read_string();
		if (!id.equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id: " + id);
		final Invalid_Stock result = new Invalid_Stock(id);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final Invalid_Stock s)
	{
		out.write_string(id());
	}
}
