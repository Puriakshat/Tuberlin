package org.omg.dds;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "TopicListener".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class TopicListenerPOATie
	extends TopicListenerPOA
{
	private TopicListenerOperations _delegate;

	private POA _poa;
	public TopicListenerPOATie(TopicListenerOperations delegate)
	{
		_delegate = delegate;
	}
	public TopicListenerPOATie(TopicListenerOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.dds.TopicListener _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.dds.TopicListener __r = org.omg.dds.TopicListenerHelper.narrow(__o);
		return __r;
	}
	public org.omg.dds.TopicListener _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.dds.TopicListener __r = org.omg.dds.TopicListenerHelper.narrow(__o);
		return __r;
	}
	public TopicListenerOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TopicListenerOperations delegate)
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
	public void on_inconsistent_topic(org.omg.dds.Topic the_topic, org.omg.dds.InconsistentTopicStatus status)
	{
_delegate.on_inconsistent_topic(the_topic,status);
	}

}
