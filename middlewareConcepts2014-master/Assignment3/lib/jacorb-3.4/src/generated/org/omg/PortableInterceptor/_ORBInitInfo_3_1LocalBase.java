package org.omg.PortableInterceptor;


/**
 * Abstract base class for implementations of local interface ORBInitInfo_3_1
 * @author JacORB IDL compiler.
 */

public abstract class _ORBInitInfo_3_1LocalBase
	extends org.omg.CORBA.LocalObject
	implements ORBInitInfo_3_1
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private String[] _type_ids = {"IDL:omg.org/PortableInterceptor/ORBInitInfo_3_1:1.0","IDL:omg.org/PortableInterceptor/ORBInitInfo:1.0"};
	public String[] _ids()	{
		return(String[])_type_ids.clone();
	}
}
