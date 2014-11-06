package org.omg.PortableInterceptor;


/**
 * Generated from IDL interface "ProcessingModePolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class ProcessingModePolicyHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(ProcessingModePolicyHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_local_interface_tc("IDL:omg.org/PortableInterceptor/ProcessingModePolicy:1.0", "ProcessingModePolicy");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.PortableInterceptor.ProcessingModePolicy s)
	{
			any.insert_Object(s);
	}
	public static org.omg.PortableInterceptor.ProcessingModePolicy extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:omg.org/PortableInterceptor/ProcessingModePolicy:1.0";
	}
	public static ProcessingModePolicy read(final org.omg.CORBA.portable.InputStream in)
	{
		throw new org.omg.CORBA.MARSHAL();
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.PortableInterceptor.ProcessingModePolicy s)
	{
		throw new org.omg.CORBA.MARSHAL();
	}
	public static org.omg.PortableInterceptor.ProcessingModePolicy narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.PortableInterceptor.ProcessingModePolicy)
		{
			return (org.omg.PortableInterceptor.ProcessingModePolicy)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.PortableInterceptor.ProcessingModePolicy unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.PortableInterceptor.ProcessingModePolicy)
		{
			return (org.omg.PortableInterceptor.ProcessingModePolicy)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
}
