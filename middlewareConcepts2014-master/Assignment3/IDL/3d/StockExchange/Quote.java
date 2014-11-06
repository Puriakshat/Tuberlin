package StockExchange;

/**
 * Generated from IDL struct "Quote".
 *
 * @author JacORB IDL compiler V 3.4
 * @version generated at 02-Jun-2014 09:21:34
 */

public final class Quote
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public Quote(){}
	public java.lang.String name = "";
	public java.lang.String id = "";
	public java.lang.String price = "";
	public Quote(java.lang.String name, java.lang.String id, java.lang.String price)
	{
		this.name = name;
		this.id = id;
		this.price = price;
	}
}
