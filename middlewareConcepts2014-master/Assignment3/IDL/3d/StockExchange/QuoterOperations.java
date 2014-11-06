package StockExchange;


/**
 * Generated from IDL interface "Quoter".
 *
 * @author JacORB IDL compiler V 3.4
 * @version generated at 02-Jun-2014 09:21:34
 */

public interface QuoterOperations
{
	/* constants */
	/* operations  */
	StockExchange.Quote getQuote(java.lang.String quoteInfo) throws StockExchange.Invalid_Stock;
}
