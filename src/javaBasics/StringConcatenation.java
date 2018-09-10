package javaBasics;

public class StringConcatenation {

	public static void main(String[] args) {

		// +: is concatenation operator
		// println---is used to print on the console with a new line
		// print---is used to print on the console

		int a = 100;
		int b = 200;

		double c = 12.11;
		double d = 10.33;

		String x = "Hello";
		String y = "World";

		System.out.println(a + b);
		System.out.println(x + y);

		System.out.println(a + b + x + y);
		System.out.println(x + y + a + b);
		System.out.println(x + y + (a + b));
		System.out.println(a + b + x + y + a + x + b + y);
		System.out.println(a + b + x + y + a + b);
		System.out.println(c + d);
		System.out.println(c + d + x + y + c + d);
		System.out.println("helloworld");
		System.out.println("the value of a is:" + a);
		System.out.println("the value of b is:" + b);
		System.out.println("the addition of a and b is:" + (a + b));

		System.out.print("Siriyala   ");
		System.out.println("  Habeeb");

	}

}
