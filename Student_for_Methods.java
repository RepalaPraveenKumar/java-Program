package Package1;

public class Student_for_Methods //Calling all Access specifiers within the Package for Methods
{

	public static void main(String[] args)
	{
		/*
		 How can i access the static method of a different class?
		 Ans: By using "Class Name . Method Name"
		 */
		
		Teacher_for_Methods.add();
		Teacher_for_Methods.mul();
		Teacher_for_Methods.sub();
		
		/*
		 by using class name.method name [Teacher_for_Methods.add();] i can able to access only 3 methods
		 that is add, sub, mul, but not able to access the div method because the access specifier of the div is Private
		 */
		
		/*
		 When you have multiple classes present in single package i will only be able to access the
		 Public member
		 Protected member
		 Package/default member
		 But i will never be access the Private member
		 */
		
	}

}
