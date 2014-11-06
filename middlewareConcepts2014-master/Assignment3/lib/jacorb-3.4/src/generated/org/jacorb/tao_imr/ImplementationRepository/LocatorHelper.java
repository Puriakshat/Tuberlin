package org.jacorb.tao_imr.ImplementationRepository;


/**
 * Generated from IDL interface "Locator".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class LocatorHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(LocatorHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:ImplementationRepository/Locator:1.0", "Locator");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.jacorb.tao_imr.ImplementationRepository.Locator s)
	{
			any.insert_Object(s);
	}
	public static org.jacorb.tao_imr.ImplementationRepository.Locator extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:ImplementationRepository/Locator:1.0";
	}
	public static Locator read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.jacorb.tao_imr.ImplementationRepository._LocatorStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.jacorb.tao_imr.ImplementationRepository.Locator s)
	{
		_out.write_Object(s);
	}
	public static org.jacorb.tao_imr.ImplementationRepository.Locator narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.jacorb.tao_imr.ImplementationRepository.Locator)
		{
			return (org.jacorb.tao_imr.ImplementationRepository.Locator)obj;
		}
		else if (obj._is_a("IDL:ImplementationRepository/Locator:1.0"))
		{
			org.jacorb.tao_imr.ImplementationRepository._LocatorStub stub;
			stub = new org.jacorb.tao_imr.ImplementationRepository._LocatorStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.jacorb.tao_imr.ImplementationRepository.Locator unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.jacorb.tao_imr.ImplementationRepository.Locator)
		{
			return (org.jacorb.tao_imr.ImplementationRepository.Locator)obj;
		}
		else
		{
			org.jacorb.tao_imr.ImplementationRepository._LocatorStub stub;
			stub = new org.jacorb.tao_imr.ImplementationRepository._LocatorStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
