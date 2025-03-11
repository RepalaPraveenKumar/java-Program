package package2;

import Package1.Teacher_for_Methods; //import the Teacher class form the java.Package1 package

public class Student_for_Methods_in_different_package extends Teacher_for_Methods
//Calling all Access specifiers outside the Package by becoming the subclass for Methods

/*
by using class name.method name [Teacher_for_Methods.add();] i can able to access only 2 methods
that is add, sub, but not able to access the mul and div method because the access specifier of the mul is default/package, div is Private
*/
{
	public static void main(String[] args)
	{
		Teacher_for_Methods.add();
		Teacher_for_Methods.sub();
		
		/*
		 When you have multiple classes present in different package i will only be able to access the
		 Public member
		 Protected member
		 But i will never be access the Package/default member and Private member
		 */
	}
}
