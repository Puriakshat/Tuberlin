package org.omg.CORBA;

/**
 * Generated from IDL alias "AbstractInterfaceDefSeq".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class AbstractInterfaceDefSeqHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;

	public static void insert (org.omg.CORBA.Any any, org.omg.CORBA.AbstractInterfaceDef[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.omg.CORBA.AbstractInterfaceDef[] extract (final org.omg.CORBA.Any any)
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
			synchronized(AbstractInterfaceDefSeqHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.AbstractInterfaceDefSeqHelper.id(), "AbstractInterfaceDefSeq",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CORBA/AbstractInterfaceDef:1.0", "AbstractInterfaceDef")));
				}
			}
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/CORBA/AbstractInterfaceDefSeq:1.0";
	}
	public static org.omg.CORBA.AbstractInterfaceDef[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.CORBA.AbstractInterfaceDef[] _result;
		int _l_result6 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result6 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result6);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new org.omg.CORBA.AbstractInterfaceDef[_l_result6];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=org.omg.CORBA.AbstractInterfaceDefHelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.CORBA.AbstractInterfaceDef[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			org.omg.CORBA.AbstractInterfaceDefHelper.write(_out,_s[i]);
		}

	}
}
