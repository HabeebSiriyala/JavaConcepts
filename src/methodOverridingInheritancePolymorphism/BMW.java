package methodOverridingInheritancePolymorphism;

public class BMW extends Car{//"has-a-relationship"
	//Has-a-Relationship---->>Means Class to Class Relationship
	
	//When Same Method is present In Parent Class as well as in child class with the same name and same no. of arguments
	//is called Method Overriding
	
	public void start() { // Overridden Method
		System.out.println("BMW Start");
	}
	
	public void theftSafety() {
		System.out.println("BMW----TheftSafety");
	}
}
