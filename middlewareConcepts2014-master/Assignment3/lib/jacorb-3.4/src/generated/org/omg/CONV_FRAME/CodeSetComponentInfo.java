package org.omg.CONV_FRAME;

/**
 * Generated from IDL struct "CodeSetComponentInfo".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class CodeSetComponentInfo
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public CodeSetComponentInfo(){}
	public org.omg.CONV_FRAME.CodeSetComponent ForCharData;
	public org.omg.CONV_FRAME.CodeSetComponent ForWcharData;
	public CodeSetComponentInfo(org.omg.CONV_FRAME.CodeSetComponent ForCharData, org.omg.CONV_FRAME.CodeSetComponent ForWcharData)
	{
		this.ForCharData = ForCharData;
		this.ForWcharData = ForWcharData;
	}
}
