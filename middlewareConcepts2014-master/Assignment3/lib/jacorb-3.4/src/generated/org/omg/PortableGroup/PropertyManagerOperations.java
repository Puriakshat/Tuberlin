package org.omg.PortableGroup;


/**
 * Generated from IDL interface "PropertyManager".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface PropertyManagerOperations
{
	/* constants */
	/* operations  */
	void set_default_properties(org.omg.PortableGroup.Property[] props) throws org.omg.PortableGroup.InvalidProperty,org.omg.PortableGroup.UnsupportedProperty;
	org.omg.PortableGroup.Property[] get_default_properties();
	void remove_default_properties(org.omg.PortableGroup.Property[] props) throws org.omg.PortableGroup.InvalidProperty,org.omg.PortableGroup.UnsupportedProperty;
	void set_type_properties(java.lang.String type_id, org.omg.PortableGroup.Property[] overrides) throws org.omg.PortableGroup.InvalidProperty,org.omg.PortableGroup.UnsupportedProperty;
	org.omg.PortableGroup.Property[] get_type_properties(java.lang.String type_id);
	void remove_type_properties(java.lang.String type_id, org.omg.PortableGroup.Property[] props) throws org.omg.PortableGroup.InvalidProperty,org.omg.PortableGroup.UnsupportedProperty;
	void set_properties_dynamically(org.omg.CORBA.Object object_group, org.omg.PortableGroup.Property[] overrides) throws org.omg.PortableGroup.InvalidProperty,org.omg.PortableGroup.ObjectGroupNotFound,org.omg.PortableGroup.UnsupportedProperty;
	org.omg.PortableGroup.Property[] get_properties(org.omg.CORBA.Object object_group) throws org.omg.PortableGroup.ObjectGroupNotFound;
}
