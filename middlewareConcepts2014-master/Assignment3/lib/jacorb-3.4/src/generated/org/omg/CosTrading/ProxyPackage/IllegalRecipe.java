package org.omg.CosTrading.ProxyPackage;

/**
 * Generated from IDL exception "IllegalRecipe".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class IllegalRecipe
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public IllegalRecipe()
	{
		super(org.omg.CosTrading.ProxyPackage.IllegalRecipeHelper.id());
	}

	public java.lang.String recipe = "";
	public IllegalRecipe(java.lang.String _reason,java.lang.String recipe)
	{
		super(_reason);
		this.recipe = recipe;
	}
	public IllegalRecipe(java.lang.String recipe)
	{
		super(org.omg.CosTrading.ProxyPackage.IllegalRecipeHelper.id());
		this.recipe = recipe;
	}
}
