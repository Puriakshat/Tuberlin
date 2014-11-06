package d.server;

import QuoterPackage.Invalid_Stock;


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
	Quote getQuote(java.lang.String quoteInfo) throws Invalid_Stock;
}
