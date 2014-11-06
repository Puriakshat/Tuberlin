package StockExchangeD;


/**
 * Generated from IDL interface "Quoter".
 *
 * @author JacORB IDL compiler V 3.4
 * @version generated at 03-Jun-2014 08:18:59
 */

public abstract class QuoterHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(QuoterHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:StockExchangeD/Quoter:1.0", "Quoter");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final StockExchangeD.Quoter s)
	{
			any.insert_Object(s);
	}
	public static StockExchangeD.Quoter extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:StockExchangeD/Quoter:1.0";
	}
	public static Quoter read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(StockExchangeD._QuoterStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final StockExchangeD.Quoter s)
	{
		_out.write_Object(s);
	}
	public static StockExchangeD.Quoter narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof StockExchangeD.Quoter)
		{
			return (StockExchangeD.Quoter)obj;
		}
		else if (obj._is_a("IDL:StockExchangeD/Quoter:1.0"))
		{
			StockExchangeD._QuoterStub stub;
			stub = new StockExchangeD._QuoterStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static StockExchangeD.Quoter unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof StockExchangeD.Quoter)
		{
			return (StockExchangeD.Quoter)obj;
		}
		else
		{
			StockExchangeD._QuoterStub stub;
			stub = new StockExchangeD._QuoterStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
