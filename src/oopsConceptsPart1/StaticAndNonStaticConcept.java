package oopsConceptsPart1;

public class StaticAndNonStaticConcept {

	// Global variables---> the Scope of global variables will be available across
	// all the functions with some Conditions
	String Name = "Habeeb"; // Non-static/Global variable
	static int age = 25; // Static Global Variable

	public static void main(String[] args) {

		// How to Call Static Methods?
		// Direct Calling;
		sum();
		// Calling By Classname
		StaticAndNonStaticConcept.sum();

		// How to Call Static Variables?
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);

		// How to Call Non-Static Methods and Non-Static Variables?
		StaticAndNonStaticConcept obj1 = new StaticAndNonStaticConcept();
		System.out.println(obj1.Name);
		obj1.sendMail();

		// Can I access Static Methods by using Object reference?---->Yes
		// obj1.sum(); //Warning will be Given

	}

	public void sendMail() { // Non Static Method
		System.out.println("sendMail Method");

	}

	public static void sum() { // Static Method
		System.out.println("Sum Methods");
	}

}
