package org.omg.CosNotifyChannelAdmin;
/**
 * Generated from IDL enum "ObtainInfoMode".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class ObtainInfoModeHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(ObtainInfoModeHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.CosNotifyChannelAdmin.ObtainInfoModeHelper.id(),"ObtainInfoMode",new String[]{"ALL_NOW_UPDATES_OFF","ALL_NOW_UPDATES_ON","NONE_NOW_UPDATES_OFF","NONE_NOW_UPDATES_ON"});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosNotifyChannelAdmin.ObtainInfoMode s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosNotifyChannelAdmin.ObtainInfoMode extract (final org.omg.CORBA.Any any)
	{
		org.omg.CORBA.portable.InputStream in = any.create_input_stream();
		try
		{
			return read (in);
		}
		finally
		{
			try
			{
				in.close();
			}
			catch (java.io.IOException e)
			{
			throw new RuntimeException("Unexpected exception " + e.toString() );
			}
		}
	}

	public static String id()
	{
		return "IDL:omg.org/CosNotifyChannelAdmin/ObtainInfoMode:1.0";
	}
	public static ObtainInfoMode read (final org.omg.CORBA.portable.InputStream in)
	{
		return ObtainInfoMode.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final ObtainInfoMode s)
	{
		out.write_long(s.value());
	}
}
