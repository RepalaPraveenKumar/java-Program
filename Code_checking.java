package basicprogram;
class Parent
{
    void display()
    {
        System.out.println("Parent class display method");
    }
}

class Child extends Parent
{
    void display()
    {
        super.display(); // Calls parent class method
        System.out.println("Child class display method");
    }
}

public class Code_checking
{
    public static void main(String[] args)
    {
        Child obj = new Child();
        obj.display();
    }
}

