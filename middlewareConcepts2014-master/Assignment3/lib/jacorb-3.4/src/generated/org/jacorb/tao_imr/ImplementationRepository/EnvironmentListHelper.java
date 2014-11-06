package org.jacorb.tao_imr.ImplementationRepository;

/**
 * Generated from IDL alias "EnvironmentList".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class EnvironmentListHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;

	public static void insert (org.omg.CORBA.Any any, org.jacorb.tao_imr.ImplementationRepository.EnvironmentVariable[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.jacorb.tao_imr.ImplementationRepository.EnvironmentVariable[] extract (final org.omg.CORBA.Any any)
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
			synchronized(EnvironmentListHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_alias_tc(org.jacorb.tao_imr.ImplementationRepository.EnvironmentListHelper.id(), "EnvironmentList",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(org.jacorb.tao_imr.ImplementationRepository.EnvironmentVariableHelper.id(),"EnvironmentVariable",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})));
				}
			}
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:ImplementationRepository/EnvironmentList:1.0";
	}
	public static org.jacorb.tao_imr.ImplementationRepository.EnvironmentVariable[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.jacorb.tao_imr.ImplementationRepository.EnvironmentVariable[] _result;
		int _l_result164 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result164 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result164);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new org.jacorb.tao_imr.ImplementationRepository.EnvironmentVariable[_l_result164];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=org.jacorb.tao_imr.ImplementationRepository.EnvironmentVariableHelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.jacorb.tao_imr.ImplementationRepository.EnvironmentVariable[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			org.jacorb.tao_imr.ImplementationRepository.EnvironmentVariableHelper.write(_out,_s[i]);
		}

	}
}
