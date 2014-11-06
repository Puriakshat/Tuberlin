package org.omg.CosNotifyFilter;


/**
 * Generated from IDL interface "FilterFactory".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface FilterFactoryOperations
{
	/* constants */
	/* operations  */
	org.omg.CosNotifyFilter.Filter create_filter(java.lang.String constraint_grammar) throws org.omg.CosNotifyFilter.InvalidGrammar;
	org.omg.CosNotifyFilter.MappingFilter create_mapping_filter(java.lang.String constraint_grammar, org.omg.CORBA.Any default_value) throws org.omg.CosNotifyFilter.InvalidGrammar;
}
