package org.omg.PortableGroup;


/**
 * Generated from IDL interface "GenericFactory".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface GenericFactoryOperations
{
	/* constants */
	/* operations  */
	org.omg.CORBA.Object create_object(java.lang.String type_id, org.omg.PortableGroup.Property[] the_criteria, org.omg.CORBA.AnyHolder factory_creation_id) throws org.omg.PortableGroup.InvalidProperty,org.omg.PortableGroup.ObjectNotCreated,org.omg.PortableGroup.InvalidCriteria,org.omg.PortableGroup.CannotMeetCriteria,org.omg.PortableGroup.NoFactory;
	void delete_object(org.omg.CORBA.Any factory_creation_id) throws org.omg.PortableGroup.ObjectNotFound;
}
