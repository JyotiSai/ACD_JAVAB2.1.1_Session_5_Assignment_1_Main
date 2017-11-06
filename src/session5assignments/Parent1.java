package session5assignments; //Package declaration

public class Parent1 extends Parent // Child class Parent1 extends Parent class Parent
{
	public void childrenCount() // Overrides and implements the abstract method childrenCount from abstract class Parent
	{
		System.out.println("Parent1 has two children"); // Prints the output
	}

	public static void main(String args[]) // This is the main method where execution begins
	{
		Parent object = new Parent1(); // new object of child class is created and assigned to reference object of Parent class
		object.childrenCount(); // childrenCount() method is called
	
	} // main method closed
} // Class closed