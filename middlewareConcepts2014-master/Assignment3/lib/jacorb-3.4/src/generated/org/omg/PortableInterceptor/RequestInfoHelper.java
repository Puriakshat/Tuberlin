package org.omg.PortableInterceptor;


/**
 * Generated from IDL interface "RequestInfo".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class RequestInfoHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(RequestInfoHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_local_interface_tc("IDL:omg.org/PortableInterceptor/RequestInfo:1.0", "RequestInfo");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.PortableInterceptor.RequestInfo s)
	{
			any.insert_Object(s);
	}
	public static org.omg.PortableInterceptor.RequestInfo extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:omg.org/PortableInterceptor/RequestInfo:1.0";
	}
	public static RequestInfo read(final org.omg.CORBA.portable.InputStream in)
	{
		throw new org.omg.CORBA.MARSHAL();
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.PortableInterceptor.RequestInfo s)
	{
		throw new org.omg.CORBA.MARSHAL();
	}
	public static org.omg.PortableInterceptor.RequestInfo narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.PortableInterceptor.RequestInfo)
		{
			return (org.omg.PortableInterceptor.RequestInfo)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.PortableInterceptor.RequestInfo unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.PortableInterceptor.RequestInfo)
		{
			return (org.omg.PortableInterceptor.RequestInfo)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
}
