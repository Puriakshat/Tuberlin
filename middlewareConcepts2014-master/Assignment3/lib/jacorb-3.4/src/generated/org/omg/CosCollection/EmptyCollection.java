package org.omg.CosCollection;

/**
 * Generated from IDL exception "EmptyCollection".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class EmptyCollection
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public EmptyCollection()
	{
		super(org.omg.CosCollection.EmptyCollectionHelper.id());
	}

	public EmptyCollection(String value)
	{
		super(value);
	}
}
