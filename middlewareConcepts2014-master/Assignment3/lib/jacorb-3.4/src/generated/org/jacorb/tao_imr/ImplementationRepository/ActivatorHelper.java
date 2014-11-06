package org.jacorb.tao_imr.ImplementationRepository;


/**
 * Generated from IDL interface "Activator".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class ActivatorHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(ActivatorHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:ImplementationRepository/Activator:1.0", "Activator");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.jacorb.tao_imr.ImplementationRepository.Activator s)
	{
			any.insert_Object(s);
	}
	public static org.jacorb.tao_imr.ImplementationRepository.Activator extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:ImplementationRepository/Activator:1.0";
	}
	public static Activator read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.jacorb.tao_imr.ImplementationRepository._ActivatorStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.jacorb.tao_imr.ImplementationRepository.Activator s)
	{
		_out.write_Object(s);
	}
	public static org.jacorb.tao_imr.ImplementationRepository.Activator narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.jacorb.tao_imr.ImplementationRepository.Activator)
		{
			return (org.jacorb.tao_imr.ImplementationRepository.Activator)obj;
		}
		else if (obj._is_a("IDL:ImplementationRepository/Activator:1.0"))
		{
			org.jacorb.tao_imr.ImplementationRepository._ActivatorStub stub;
			stub = new org.jacorb.tao_imr.ImplementationRepository._ActivatorStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.jacorb.tao_imr.ImplementationRepository.Activator unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.jacorb.tao_imr.ImplementationRepository.Activator)
		{
			return (org.jacorb.tao_imr.ImplementationRepository.Activator)obj;
		}
		else
		{
			org.jacorb.tao_imr.ImplementationRepository._ActivatorStub stub;
			stub = new org.jacorb.tao_imr.ImplementationRepository._ActivatorStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
