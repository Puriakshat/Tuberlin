package org.jacorb.tao_imr.ImplementationRepository;
/**
 * Generated from IDL enum "ActivationMode".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ActivationMode
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _NORMAL = 0;
	public static final ActivationMode NORMAL = new ActivationMode(_NORMAL);
	public static final int _MANUAL = 1;
	public static final ActivationMode MANUAL = new ActivationMode(_MANUAL);
	public static final int _PER_CLIENT = 2;
	public static final ActivationMode PER_CLIENT = new ActivationMode(_PER_CLIENT);
	public static final int _AUTO_START = 3;
	public static final ActivationMode AUTO_START = new ActivationMode(_AUTO_START);
	public int value()
	{
		return value;
	}
	public static ActivationMode from_int(int value)
	{
		switch (value) {
			case _NORMAL: return NORMAL;
			case _MANUAL: return MANUAL;
			case _PER_CLIENT: return PER_CLIENT;
			case _AUTO_START: return AUTO_START;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _NORMAL: return "NORMAL";
			case _MANUAL: return "MANUAL";
			case _PER_CLIENT: return "PER_CLIENT";
			case _AUTO_START: return "AUTO_START";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected ActivationMode(int i)
	{
		value = i;
	}
	/**
	 * Designate replacement object when deserialized from stream. See
	 * http://www.omg.org/docs/ptc/02-01-03.htm#Issue4271
	 *
	 * @throws java.io.ObjectStreamException
	 */
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
