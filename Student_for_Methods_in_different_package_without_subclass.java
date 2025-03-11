package Package3;

import Package1.Teacher_for_Methods; //import the Teacher class form the java.Package1 package

public class Student_for_Methods_in_different_package_without_subclass
//Calling all Access specifiers outside the Package without becoming the subclass for Methods


/*
by using class name.method name [Teacher_for_Methods.add();] i can able to access only 1 method
that is add, but not able to access the sub, mul and div method because the access specifier of the sub is protected, mul is default/package, div is Private
*/
{
	public static void main(String[] args)
	{
		Teacher_for_Methods.add();
		
		
		/*
		 When you have multiple classes present in different package i will only be able to access the
		 Public member
		 But i will never be access the Protected member, Package/default member and Private member
		 */
	}
}	