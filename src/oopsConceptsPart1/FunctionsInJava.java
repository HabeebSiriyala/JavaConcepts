 package oopsConceptsPart1;

public class FunctionsInJava {

	// main() method---- Starting point of execution
	public static void main(String[] args) {

		FunctionsInJava obj = new FunctionsInJava();
		// One Object will be created, obj is the reference variable referring to this
		// object
		// After creating the object, The Copy of all non-static methods will be given
		// to this Object

		obj.test();

		int add = obj.pqr();
		System.out.println(add);

		String s1 = obj.qa();
		System.out.println(s1);

		int div = obj.division(50, 5);
		System.out.println(div);

		// main method is void--->it never returns a value
	}

	// Non Static Methods
	// void---does not return any value
	// Return type is void
	public void test() {// ---no input no output
		System.out.println("this is the test method");
	}

	// return type = int
	public int pqr() {// ---no input some output
		System.out.println("pqr method");
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;
	}

	// Return type is String
	public String qa() {// ---no input some output
		System.out.println("qa method");
		String s = "selenium";
		return s;
	}

	// Return type is int
	// x,y---iput parameters/arguments
	public int division(int x, int y) {//---Some input and Some Output
		System.out.println("division method");
		int d = x / y;
		return d;
	}
}
