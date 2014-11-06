package org.omg.CosCollection;

/**
 * Generated from IDL struct "NVPair".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class NVPairHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosCollection.NVPair value;

	public NVPairHolder ()
	{
	}
	public NVPairHolder(final org.omg.CosCollection.NVPair initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosCollection.NVPairHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosCollection.NVPairHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosCollection.NVPairHelper.write(_out, value);
	}
}
