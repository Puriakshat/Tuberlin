package org.omg.DynamicAny;


/**
 * Generated from IDL interface "DynValueBox".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class DynValueBoxHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(DynValueBoxHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_local_interface_tc("IDL:omg.org/DynamicAny/DynValueBox:1.0", "DynValueBox");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.DynamicAny.DynValueBox s)
	{
			any.insert_Object(s);
	}
	public static org.omg.DynamicAny.DynValueBox extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:omg.org/DynamicAny/DynValueBox:1.0";
	}
	public static DynValueBox read(final org.omg.CORBA.portable.InputStream in)
	{
		throw new org.omg.CORBA.MARSHAL();
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.DynamicAny.DynValueBox s)
	{
		throw new org.omg.CORBA.MARSHAL();
	}
	public static org.omg.DynamicAny.DynValueBox narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.DynamicAny.DynValueBox)
		{
			return (org.omg.DynamicAny.DynValueBox)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.DynamicAny.DynValueBox unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.DynamicAny.DynValueBox)
		{
			return (org.omg.DynamicAny.DynValueBox)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
}
