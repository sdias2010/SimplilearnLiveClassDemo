package corejavaassignments;

import package1.PublicAccessModifier;

public class AccessModifiers extends ProtectedAccessModifier{
	public static void main(String[] args) {
		
		//accessing default access modifier.
		DefaultAccessModifier defacc = new DefaultAccessModifier();
		defacc.MessageDisplay();
		
		//accessing private access modifier.
		//PrivateAccessModifier priacc = new PrivateAccessModifier();
		//priacc.MessageDisplay(); //It gives the message - The method MessageDisplay() from the type PrivateAccessModifier is not visible
		
		//accessing protected access modifier from same package.
		ProtectedAccessModifier proacc = new ProtectedAccessModifier();
		proacc.MessageDisplay();
		
		//accessing public access modifier from different package.
		PublicAccessModifier pubacc = new PublicAccessModifier();
		pubacc.MessageDisplay();
	}

}
