package org.omg.CosTransactions;

/**
 * Generated from IDL struct "TransIdentity".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class TransIdentity
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public TransIdentity(){}
	public org.omg.CosTransactions.Coordinator coord;
	public org.omg.CosTransactions.Terminator term;
	public org.omg.CosTransactions.otid_t otid;
	public TransIdentity(org.omg.CosTransactions.Coordinator coord, org.omg.CosTransactions.Terminator term, org.omg.CosTransactions.otid_t otid)
	{
		this.coord = coord;
		this.term = term;
		this.otid = otid;
	}
}
