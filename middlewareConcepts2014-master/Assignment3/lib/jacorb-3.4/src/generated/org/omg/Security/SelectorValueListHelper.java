package org.omg.Security;

/**
 * Generated from IDL alias "SelectorValueList".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class SelectorValueListHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;

	public static void insert (org.omg.CORBA.Any any, org.omg.Security.SelectorValue[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.omg.Security.SelectorValue[] extract (final org.omg.CORBA.Any any)
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
			synchronized(SelectorValueListHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.Security.SelectorValueListHelper.id(), "SelectorValueList",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(org.omg.Security.SelectorValueHelper.id(),"SelectorValue",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("selector", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.Security.SelectorTypeHelper.id(), "SelectorType",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5))), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(11)), null)})));
				}
			}
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/Security/SelectorValueList:1.0";
	}
	public static org.omg.Security.SelectorValue[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.Security.SelectorValue[] _result;
		int _l_result157 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result157 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result157);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new org.omg.Security.SelectorValue[_l_result157];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=org.omg.Security.SelectorValueHelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.Security.SelectorValue[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			org.omg.Security.SelectorValueHelper.write(_out,_s[i]);
		}

	}
}
