package org.jacorb.tao_imr.ImplementationRepository;


/**
 * Generated from IDL interface "Activator".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class _ActivatorStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.jacorb.tao_imr.ImplementationRepository.Activator
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private String[] ids = {"IDL:ImplementationRepository/Activator:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.jacorb.tao_imr.ImplementationRepository.ActivatorOperations.class;
	public void shutdown()
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "shutdown", false);
					_is = _invoke(_os);
					return;
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "shutdown", _opsClass );
			if( _so == null )
				continue;
			ActivatorOperations _localServant = (ActivatorOperations)_so.servant;
			try
			{
				_localServant.shutdown();
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
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

	public void start_server(java.lang.String name, java.lang.String cmdline, java.lang.String dir, org.jacorb.tao_imr.ImplementationRepository.EnvironmentVariable[] env) throws org.jacorb.tao_imr.ImplementationRepository.CannotActivate
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "start_server", true);
					java.lang.String tmpResult1246 = name;
_os.write_string( tmpResult1246 );
					java.lang.String tmpResult1247 = cmdline;
_os.write_string( tmpResult1247 );
					java.lang.String tmpResult1248 = dir;
_os.write_string( tmpResult1248 );
					org.jacorb.tao_imr.ImplementationRepository.EnvironmentListHelper.write(_os,env);
					_is = _invoke(_os);
					return;
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
						if( _id.equals("IDL:ImplementationRepository/CannotActivate:1.0"))
						{
							throw org.jacorb.tao_imr.ImplementationRepository.CannotActivateHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "start_server", _opsClass );
			if( _so == null )
				continue;
			ActivatorOperations _localServant = (ActivatorOperations)_so.servant;
			try
			{
				_localServant.start_server(name,cmdline,dir,env);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (org.jacorb.tao_imr.ImplementationRepository.CannotActivate ex) 
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

}
