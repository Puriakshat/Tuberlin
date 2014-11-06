package org.omg.PortableInterceptor;


/**
 * Abstract base class for implementations of local interface ProcessingModePolicy
 * @author JacORB IDL compiler.
 */

public abstract class _ProcessingModePolicyLocalBase
	extends org.omg.CORBA.LocalObject
	implements ProcessingModePolicy
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private String[] _type_ids = {"IDL:omg.org/PortableInterceptor/ProcessingModePolicy:1.0","IDL:omg.org/CORBA/Policy:1.0"};
	public String[] _ids()	{
		return(String[])_type_ids.clone();
	}
}
