package advanced_concepts;

class Parent
{
    void show()
    {
        System.out.println("Parent class method");
    }
}

public class ClassTypeCasting extends Parent
{
	void show2() {
        System.out.println("Child class method");
    }
	public static void main(String[] args)
	{
		Parent p1= new ClassTypeCasting(); // implicit way of ClassType Upcasting
		p1.show();
		
		System.out.println("---------------------");
		Parent p2= (Parent) new ClassTypeCasting(); // Explicit way of ClassType Upcasting
		p2.show();

		System.out.println("---------------------");

		ClassTypeCasting p3 = (ClassTypeCasting) p1;   //Downcasting
		p3.show2();

	}

}
