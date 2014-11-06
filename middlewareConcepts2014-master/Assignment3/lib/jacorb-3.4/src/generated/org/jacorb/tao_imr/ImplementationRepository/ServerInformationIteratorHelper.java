package org.jacorb.tao_imr.ImplementationRepository;


/**
 * Generated from IDL interface "ServerInformationIterator".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class ServerInformationIteratorHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(ServerInformationIteratorHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:ImplementationRepository/ServerInformationIterator:1.0", "ServerInformationIterator");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.jacorb.tao_imr.ImplementationRepository.ServerInformationIterator s)
	{
			any.insert_Object(s);
	}
	public static org.jacorb.tao_imr.ImplementationRepository.ServerInformationIterator extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:ImplementationRepository/ServerInformationIterator:1.0";
	}
	public static ServerInformationIterator read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.jacorb.tao_imr.ImplementationRepository._ServerInformationIteratorStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.jacorb.tao_imr.ImplementationRepository.ServerInformationIterator s)
	{
		_out.write_Object(s);
	}
	public static org.jacorb.tao_imr.ImplementationRepository.ServerInformationIterator narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.jacorb.tao_imr.ImplementationRepository.ServerInformationIterator)
		{
			return (org.jacorb.tao_imr.ImplementationRepository.ServerInformationIterator)obj;
		}
		else if (obj._is_a("IDL:ImplementationRepository/ServerInformationIterator:1.0"))
		{
			org.jacorb.tao_imr.ImplementationRepository._ServerInformationIteratorStub stub;
			stub = new org.jacorb.tao_imr.ImplementationRepository._ServerInformationIteratorStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.jacorb.tao_imr.ImplementationRepository.ServerInformationIterator unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.jacorb.tao_imr.ImplementationRepository.ServerInformationIterator)
		{
			return (org.jacorb.tao_imr.ImplementationRepository.ServerInformationIterator)obj;
		}
		else
		{
			org.jacorb.tao_imr.ImplementationRepository._ServerInformationIteratorStub stub;
			stub = new org.jacorb.tao_imr.ImplementationRepository._ServerInformationIteratorStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
