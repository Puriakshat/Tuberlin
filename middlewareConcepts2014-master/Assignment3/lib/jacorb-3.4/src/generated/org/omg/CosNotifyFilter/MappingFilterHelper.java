package org.omg.CosNotifyFilter;


/**
 * Generated from IDL interface "MappingFilter".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class MappingFilterHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(MappingFilterHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosNotifyFilter/MappingFilter:1.0", "MappingFilter");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosNotifyFilter.MappingFilter s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosNotifyFilter.MappingFilter extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:omg.org/CosNotifyFilter/MappingFilter:1.0";
	}
	public static MappingFilter read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosNotifyFilter._MappingFilterStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosNotifyFilter.MappingFilter s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosNotifyFilter.MappingFilter narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosNotifyFilter.MappingFilter)
		{
			return (org.omg.CosNotifyFilter.MappingFilter)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosNotifyFilter/MappingFilter:1.0"))
		{
			org.omg.CosNotifyFilter._MappingFilterStub stub;
			stub = new org.omg.CosNotifyFilter._MappingFilterStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosNotifyFilter.MappingFilter unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosNotifyFilter.MappingFilter)
		{
			return (org.omg.CosNotifyFilter.MappingFilter)obj;
		}
		else
		{
			org.omg.CosNotifyFilter._MappingFilterStub stub;
			stub = new org.omg.CosNotifyFilter._MappingFilterStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
