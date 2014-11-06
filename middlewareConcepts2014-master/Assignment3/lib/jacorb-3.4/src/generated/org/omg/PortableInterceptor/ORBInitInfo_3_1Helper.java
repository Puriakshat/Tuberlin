package org.omg.PortableInterceptor;


/**
 * Generated from IDL interface "ORBInitInfo_3_1".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class ORBInitInfo_3_1Helper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(ORBInitInfo_3_1Helper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_local_interface_tc("IDL:omg.org/PortableInterceptor/ORBInitInfo_3_1:1.0", "ORBInitInfo_3_1");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.PortableInterceptor.ORBInitInfo_3_1 s)
	{
			any.insert_Object(s);
	}
	public static org.omg.PortableInterceptor.ORBInitInfo_3_1 extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:omg.org/PortableInterceptor/ORBInitInfo_3_1:1.0";
	}
	public static ORBInitInfo_3_1 read(final org.omg.CORBA.portable.InputStream in)
	{
		throw new org.omg.CORBA.MARSHAL();
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.PortableInterceptor.ORBInitInfo_3_1 s)
	{
		throw new org.omg.CORBA.MARSHAL();
	}
	public static org.omg.PortableInterceptor.ORBInitInfo_3_1 narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.PortableInterceptor.ORBInitInfo_3_1)
		{
			return (org.omg.PortableInterceptor.ORBInitInfo_3_1)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.PortableInterceptor.ORBInitInfo_3_1 unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.PortableInterceptor.ORBInitInfo_3_1)
		{
			return (org.omg.PortableInterceptor.ORBInitInfo_3_1)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
}
