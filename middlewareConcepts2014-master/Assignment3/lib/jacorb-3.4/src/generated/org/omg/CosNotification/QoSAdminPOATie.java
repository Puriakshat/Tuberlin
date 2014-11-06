package org.omg.CosNotification;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "QoSAdmin".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class QoSAdminPOATie
	extends QoSAdminPOA
{
	private QoSAdminOperations _delegate;

	private POA _poa;
	public QoSAdminPOATie(QoSAdminOperations delegate)
	{
		_delegate = delegate;
	}
	public QoSAdminPOATie(QoSAdminOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosNotification.QoSAdmin _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CosNotification.QoSAdmin __r = org.omg.CosNotification.QoSAdminHelper.narrow(__o);
		return __r;
	}
	public org.omg.CosNotification.QoSAdmin _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CosNotification.QoSAdmin __r = org.omg.CosNotification.QoSAdminHelper.narrow(__o);
		return __r;
	}
	public QoSAdminOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(QoSAdminOperations delegate)
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
	public void validate_qos(org.omg.CosNotification.Property[] required_qos, org.omg.CosNotification.NamedPropertyRangeSeqHolder available_qos) throws org.omg.CosNotification.UnsupportedQoS
	{
_delegate.validate_qos(required_qos,available_qos);
	}

	public org.omg.CosNotification.Property[] get_qos()
	{
		return _delegate.get_qos();
	}

	public void set_qos(org.omg.CosNotification.Property[] qos) throws org.omg.CosNotification.UnsupportedQoS
	{
_delegate.set_qos(qos);
	}

}
