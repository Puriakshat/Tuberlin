package org.omg.dds;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "ContentFilteredTopic".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class ContentFilteredTopicPOATie
	extends ContentFilteredTopicPOA
{
	private ContentFilteredTopicOperations _delegate;

	private POA _poa;
	public ContentFilteredTopicPOATie(ContentFilteredTopicOperations delegate)
	{
		_delegate = delegate;
	}
	public ContentFilteredTopicPOATie(ContentFilteredTopicOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.dds.ContentFilteredTopic _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.dds.ContentFilteredTopic __r = org.omg.dds.ContentFilteredTopicHelper.narrow(__o);
		return __r;
	}
	public org.omg.dds.ContentFilteredTopic _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.dds.ContentFilteredTopic __r = org.omg.dds.ContentFilteredTopicHelper.narrow(__o);
		return __r;
	}
	public ContentFilteredTopicOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ContentFilteredTopicOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		return super._default_POA();
	}
	public org.omg.dds.DomainParticipant get_participant()
	{
		return _delegate.get_participant();
	}

	public java.lang.String[] get_expression_parameters()
	{
		return _delegate.get_expression_parameters();
	}

	public java.lang.String get_filter_expression()
	{
		return _delegate.get_filter_expression();
	}

	public org.omg.dds.Topic get_related_topic()
	{
		return _delegate.get_related_topic();
	}

	public int set_expression_parameters(java.lang.String[] expression_parameters)
	{
		return _delegate.set_expression_parameters(expression_parameters);
	}

	public java.lang.String get_type_name()
	{
		return _delegate.get_type_name();
	}

	public java.lang.String get_name()
	{
		return _delegate.get_name();
	}

}
