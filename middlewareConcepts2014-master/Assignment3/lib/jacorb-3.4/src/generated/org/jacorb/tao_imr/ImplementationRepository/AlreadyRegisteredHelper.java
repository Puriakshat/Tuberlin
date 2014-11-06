package org.jacorb.tao_imr.ImplementationRepository;


/**
 * Generated from IDL exception "AlreadyRegistered".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class AlreadyRegisteredHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(AlreadyRegisteredHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_exception_tc(org.jacorb.tao_imr.ImplementationRepository.AlreadyRegisteredHelper.id(),"AlreadyRegistered",new org.omg.CORBA.StructMember[0]);
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.jacorb.tao_imr.ImplementationRepository.AlreadyRegistered s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.jacorb.tao_imr.ImplementationRepository.AlreadyRegistered extract (final org.omg.CORBA.Any any)
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
		return "IDL:ImplementationRepository/AlreadyRegistered:1.0";
	}
	public static org.jacorb.tao_imr.ImplementationRepository.AlreadyRegistered read (final org.omg.CORBA.portable.InputStream in)
	{
		String id = in.read_string();
		if (!id.equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id: " + id);
		final org.jacorb.tao_imr.ImplementationRepository.AlreadyRegistered result = new org.jacorb.tao_imr.ImplementationRepository.AlreadyRegistered(id);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.jacorb.tao_imr.ImplementationRepository.AlreadyRegistered s)
	{
		out.write_string(id());
	}
}
