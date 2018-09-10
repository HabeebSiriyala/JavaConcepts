package finalFinalizeFinallyConcepts;

public class FinallyConcept {

	public static void main(String[] args) {
		 test1();
		test2();
		division();
	}

	// Finally is a block
	public static void test1() {
		try {
			System.out.println("Inside test1 Method");
			throw new RuntimeException("test");
		} catch (Exception e) {
			System.out.println("Inside Catch block");
		} finally {
			System.out.println("Inside Finally block");
		}
		System.out.println("************************");
	}

	public static void test2() {
		try {
			System.out.println("Inside test2");
		} finally {
			System.out.println("Finally code in test2 method");
		}
		System.out.println("************************");
	}

		public static void division() {

		int i = 10;
		try {
			System.out.println("Inside try block");
			int k = i / 0;
		} catch (ArithmeticException e) {
			System.out.println("Inside catch Block");
			System.out.println("divided by Zero Error");
		} finally {
			System.out.println("execute this code even after any Exception");
		}
		System.out.println("************************");
	}
}
