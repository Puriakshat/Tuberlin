
/*
 * Created by JAC (Java Asn1 Compiler)
 */

import com.turkcelltech.jac.*;
import com.chaosinmotion.asn1.Tag;

public class ClientServer extends Sequence
{
	/**
	 * if you want to set/fill an element below, just call the setValue(..) method over its instance.
	 *
	 * To encode/decode your object, just call encode(..) decode(..) methods.
	 * See 'TestProject.java' in the project to examine encoding/decoding examples
	 */
	public ASN1Integer binaryCodedInteger = new ASN1Integer("binaryCodedInteger");
	public PrintableString randomStringOrVerification = new PrintableString("randomStringOrVerification");
	/* end of element declarations */
	
	/**
	* asn.1 SEQUENCE constructor
	*/
	public
	ClientServer()
	{
		super();
		setUpElements();
	}

	/**
	* asn.1 SEQUENCE constructor with its name
	*/
	public
	ClientServer(String name)
	{
		super(name);
		setUpElements();
	}
	

	protected void
	setUpElements()
	{
		super.addElement(binaryCodedInteger);
		super.addElement(randomStringOrVerification);
	/* end of element setup */
	}


}
