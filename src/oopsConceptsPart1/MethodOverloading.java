package oopsConceptsPart1;

public class MethodOverloading {

	public static void main(String[] args) {

		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(20, 30);
	}

	public static void main(int p) {

	}

	public static void main(int q, int s) {

	}
	// We can Overload Main method also
	// You can not create a method inside a method
	// Duplicate methods--->same method name and same no. of arguments are not
	// allowed
	// --->But same method name and same no. of arguments and different Data types
	// are allowed

	// Method Overloading--->When the method name is same with different
	// arguments(parameters) with in the same class
	public void sum() { // 0 input parameters
		System.out.println("Sum Method--zero parameters");
	}

	public void sum(int i) { // 1 input parameters
		System.out.println("Sum Method--one parameters");
	}

	public void sum(int k, int l) { // 2 input parameters
		System.out.println("Sum Method--two parameters");
	}

}
