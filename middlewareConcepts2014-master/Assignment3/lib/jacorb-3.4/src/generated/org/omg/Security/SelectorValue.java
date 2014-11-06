package org.omg.Security;

/**
 * Generated from IDL struct "SelectorValue".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class SelectorValue
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public SelectorValue(){}
	public int selector;
	public org.omg.CORBA.Any value;
	public SelectorValue(int selector, org.omg.CORBA.Any value)
	{
		this.selector = selector;
		this.value = value;
	}
}
