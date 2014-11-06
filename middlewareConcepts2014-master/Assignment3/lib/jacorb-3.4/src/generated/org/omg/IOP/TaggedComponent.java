package org.omg.IOP;

/**
 * Generated from IDL struct "TaggedComponent".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class TaggedComponent
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public TaggedComponent(){}
	public int tag;
	public byte[] component_data;
	public TaggedComponent(int tag, byte[] component_data)
	{
		this.tag = tag;
		this.component_data = component_data;
	}
}
