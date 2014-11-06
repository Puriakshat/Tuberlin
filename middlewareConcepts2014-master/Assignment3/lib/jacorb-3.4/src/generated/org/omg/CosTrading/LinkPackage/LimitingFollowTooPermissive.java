package org.omg.CosTrading.LinkPackage;

/**
 * Generated from IDL exception "LimitingFollowTooPermissive".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class LimitingFollowTooPermissive
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public LimitingFollowTooPermissive()
	{
		super(org.omg.CosTrading.LinkPackage.LimitingFollowTooPermissiveHelper.id());
	}

	public org.omg.CosTrading.FollowOption limiting_follow_rule;
	public org.omg.CosTrading.FollowOption max_link_follow_policy;
	public LimitingFollowTooPermissive(java.lang.String _reason,org.omg.CosTrading.FollowOption limiting_follow_rule, org.omg.CosTrading.FollowOption max_link_follow_policy)
	{
		super(_reason);
		this.limiting_follow_rule = limiting_follow_rule;
		this.max_link_follow_policy = max_link_follow_policy;
	}
	public LimitingFollowTooPermissive(org.omg.CosTrading.FollowOption limiting_follow_rule, org.omg.CosTrading.FollowOption max_link_follow_policy)
	{
		super(org.omg.CosTrading.LinkPackage.LimitingFollowTooPermissiveHelper.id());
		this.limiting_follow_rule = limiting_follow_rule;
		this.max_link_follow_policy = max_link_follow_policy;
	}
}
