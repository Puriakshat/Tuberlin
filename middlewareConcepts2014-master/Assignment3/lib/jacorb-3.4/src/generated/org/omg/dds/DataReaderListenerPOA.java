package org.omg.dds;


/**
 * Generated from IDL interface "DataReaderListener".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class DataReaderListenerPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.dds.DataReaderListenerOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "on_liveliness_changed", Integer.valueOf(0));
		m_opsHash.put ( "on_subscription_match", Integer.valueOf(1));
		m_opsHash.put ( "on_sample_lost", Integer.valueOf(2));
		m_opsHash.put ( "on_sample_rejected", Integer.valueOf(3));
		m_opsHash.put ( "on_requested_incompatible_qos", Integer.valueOf(4));
		m_opsHash.put ( "on_data_available", Integer.valueOf(5));
		m_opsHash.put ( "on_requested_deadline_missed", Integer.valueOf(6));
	}
	private String[] ids = {"IDL:omg.org/dds/DataReaderListener:1.0","IDL:omg.org/dds/Listener:1.0"};
	public org.omg.dds.DataReaderListener _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.dds.DataReaderListener __r = org.omg.dds.DataReaderListenerHelper.narrow(__o);
		return __r;
	}
	public org.omg.dds.DataReaderListener _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.dds.DataReaderListener __r = org.omg.dds.DataReaderListenerHelper.narrow(__o);
		return __r;
	}
	public org.omg.CORBA.portable.OutputStream _invoke(String method, org.omg.CORBA.portable.InputStream _input, org.omg.CORBA.portable.ResponseHandler handler)
		throws org.omg.CORBA.SystemException
	{
		org.omg.CORBA.portable.OutputStream _out = null;
		// do something
		// quick lookup of operation
		java.lang.Integer opsIndex = (java.lang.Integer)m_opsHash.get ( method );
		if ( null == opsIndex )
			throw new org.omg.CORBA.BAD_OPERATION(method + " not found");
		switch ( opsIndex.intValue() )
		{
			case 0: // on_liveliness_changed
			{
				org.omg.dds.DataReader _arg0=org.omg.dds.DataReaderHelper.read(_input);
				org.omg.dds.LivelinessChangedStatus _arg1=org.omg.dds.LivelinessChangedStatusHelper.read(_input);
				_out = handler.createReply();
				on_liveliness_changed(_arg0,_arg1);
				break;
			}
			case 1: // on_subscription_match
			{
				org.omg.dds.DataReader _arg0=org.omg.dds.DataReaderHelper.read(_input);
				org.omg.dds.SubscriptionMatchStatus _arg1=org.omg.dds.SubscriptionMatchStatusHelper.read(_input);
				_out = handler.createReply();
				on_subscription_match(_arg0,_arg1);
				break;
			}
			case 2: // on_sample_lost
			{
				org.omg.dds.DataReader _arg0=org.omg.dds.DataReaderHelper.read(_input);
				org.omg.dds.SampleLostStatus _arg1=org.omg.dds.SampleLostStatusHelper.read(_input);
				_out = handler.createReply();
				on_sample_lost(_arg0,_arg1);
				break;
			}
			case 3: // on_sample_rejected
			{
				org.omg.dds.DataReader _arg0=org.omg.dds.DataReaderHelper.read(_input);
				org.omg.dds.SampleRejectedStatus _arg1=org.omg.dds.SampleRejectedStatusHelper.read(_input);
				_out = handler.createReply();
				on_sample_rejected(_arg0,_arg1);
				break;
			}
			case 4: // on_requested_incompatible_qos
			{
				org.omg.dds.DataReader _arg0=org.omg.dds.DataReaderHelper.read(_input);
				org.omg.dds.RequestedIncompatibleQosStatus _arg1=org.omg.dds.RequestedIncompatibleQosStatusHelper.read(_input);
				_out = handler.createReply();
				on_requested_incompatible_qos(_arg0,_arg1);
				break;
			}
			case 5: // on_data_available
			{
				org.omg.dds.DataReader _arg0=org.omg.dds.DataReaderHelper.read(_input);
				_out = handler.createReply();
				on_data_available(_arg0);
				break;
			}
			case 6: // on_requested_deadline_missed
			{
				org.omg.dds.DataReader _arg0=org.omg.dds.DataReaderHelper.read(_input);
				org.omg.dds.RequestedDeadlineMissedStatus _arg1=org.omg.dds.RequestedDeadlineMissedStatusHelper.read(_input);
				_out = handler.createReply();
				on_requested_deadline_missed(_arg0,_arg1);
				break;
			}
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
