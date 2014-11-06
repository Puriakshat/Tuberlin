package StockExchangeD;


/**
 * Generated from IDL interface "Quoter".
 *
 * @author JacORB IDL compiler V 3.4
 * @version generated at 03-Jun-2014 08:18:59
 */

public class _QuoterStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements StockExchangeD.Quoter
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private String[] ids = {"IDL:StockExchangeD/Quoter:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = StockExchangeD.QuoterOperations.class;
	public StockExchangeD.Quote getQuote(java.lang.String quoteInfo) throws StockExchangeD.Invalid_Stock
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "getQuote", true);
					java.lang.String tmpResult3 = quoteInfo;
_os.write_string( tmpResult3 );
					_is = _invoke(_os);
					StockExchangeD.Quote _result = StockExchangeD.QuoteHelper.read(_is);
					return _result;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:StockExchangeD/Invalid_Stock:1.0"))
						{
							throw StockExchangeD.Invalid_StockHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getQuote", _opsClass );
			if( _so == null )
				continue;
			QuoterOperations _localServant = (QuoterOperations)_so.servant;
			StockExchangeD.Quote _result;
			try
			{
				_result = _localServant.getQuote(quoteInfo);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return _result;
			}
			catch (StockExchangeD.Invalid_Stock ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

	public void sendc_getQuote(AMI_QuoterHandler ami_handler, java.lang.String quoteInfo)
	{
		while(true)
		{
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getQuote", true);
				java.lang.String tmpResult4 = quoteInfo;
_os.write_string( tmpResult4 );
				((org.jacorb.orb.Delegate)_get_delegate()).invoke(this, _os, ami_handler);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx )
			{
			}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
			}
		}

	}

}
