package org.omg.Messaging;


/**
 * Generated from IDL interface "RelativeRoundtripTimeoutPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class RelativeRoundtripTimeoutPolicyHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(RelativeRoundtripTimeoutPolicyHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_local_interface_tc("IDL:omg.org/Messaging/RelativeRoundtripTimeoutPolicy:1.0", "RelativeRoundtripTimeoutPolicy");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.Messaging.RelativeRoundtripTimeoutPolicy s)
	{
			any.insert_Object(s);
	}
	public static org.omg.Messaging.RelativeRoundtripTimeoutPolicy extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:omg.org/Messaging/RelativeRoundtripTimeoutPolicy:1.0";
	}
	public static RelativeRoundtripTimeoutPolicy read(final org.omg.CORBA.portable.InputStream in)
	{
		throw new org.omg.CORBA.MARSHAL();
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.Messaging.RelativeRoundtripTimeoutPolicy s)
	{
		throw new org.omg.CORBA.MARSHAL();
	}
	public static org.omg.Messaging.RelativeRoundtripTimeoutPolicy narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.Messaging.RelativeRoundtripTimeoutPolicy)
		{
			return (org.omg.Messaging.RelativeRoundtripTimeoutPolicy)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.Messaging.RelativeRoundtripTimeoutPolicy unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.Messaging.RelativeRoundtripTimeoutPolicy)
		{
			return (org.omg.Messaging.RelativeRoundtripTimeoutPolicy)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
}
