package org.omg.GIOP;

/**
 * Generated from IDL alias "Magicn".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class MagicnHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;

	public static void insert (org.omg.CORBA.Any any, char[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static char[] extract (final org.omg.CORBA.Any any)
	{
		if ( any.type().kind() == org.omg.CORBA.TCKind.tk_null)
		{
			throw new org.omg.CORBA.BAD_OPERATION ("Can't extract from Any with null type.");
		}
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(MagicnHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.GIOP.MagicnHelper.id(), "Magicn",org.omg.CORBA.ORB.init().create_array_tc(4,org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(9))));
				}
			}
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/GIOP/Magicn:1.0";
	}
	public static char[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		char[] _result;
		_result = new char[4];
		_in.read_char_array(_result,0,4);
		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, char[] _s)
	{
				if (_s.length<4)
			throw new org.omg.CORBA.MARSHAL("Incorrect array size "+_s.length+", expecting 4");
		_out.write_char_array(_s,0,4);
	}
}
