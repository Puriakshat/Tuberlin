package org.jacorb.tao_imr.ImplementationRepository;


/**
 * Generated from IDL interface "AsyncStartupWaiter".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class _AsyncStartupWaiterStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.jacorb.tao_imr.ImplementationRepository.AsyncStartupWaiter
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private String[] ids = {"IDL:ImplementationRepository/AsyncStartupWaiter:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.jacorb.tao_imr.ImplementationRepository.AsyncStartupWaiterOperations.class;
	public org.jacorb.tao_imr.ImplementationRepository.StartupInfo wait_for_startup(java.lang.String name)
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "wait_for_startup", true);
					java.lang.String tmpResult1245 = name;
_os.write_string( tmpResult1245 );
					_is = _invoke(_os);
					org.jacorb.tao_imr.ImplementationRepository.StartupInfo _result = org.jacorb.tao_imr.ImplementationRepository.StartupInfoHelper.read(_is);
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
							_ax.getInputStream().close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
					throw new RuntimeException("Unexpected exception " + _id );
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "wait_for_startup", _opsClass );
			if( _so == null )
				continue;
			AsyncStartupWaiterOperations _localServant = (AsyncStartupWaiterOperations)_so.servant;
			org.jacorb.tao_imr.ImplementationRepository.StartupInfo _result;
			try
			{
				_result = _localServant.wait_for_startup(name);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return _result;
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

}
