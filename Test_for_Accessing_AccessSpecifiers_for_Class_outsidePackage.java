package package2;

import Package1.Public_AccessSpecifier_for_Class; // calling different classes Outside the package
// hear i can't import the class of default AccessSpecifier
public class Test_for_Accessing_AccessSpecifiers_for_Class_outsidePackage extends Public_AccessSpecifier_for_Class
{

	public static void main(String[] args)
	{
		Public_AccessSpecifier_for_Class.add();
		Public_AccessSpecifier_for_Class.sub();
		//Public_AccessSpecifier_for_Class.mul();
		
		/*
		Default_AccessSpecifier_for_Class.add();
		Default_AccessSpecifier_for_Class.sub();
		Default_AccessSpecifier_for_Class.mul();
		*/

	}

}
