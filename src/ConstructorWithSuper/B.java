package ConstructorWithSuper;

public class B extends A {

	// Super Keyword is the First Statement
	// Super keyword Should be Written inside the Child Class Constructor always.
	// public B() {
	// super(10, 20);
	// System.out.println("Child Class Constant");
	// }

	// -----------------------
	// if i want to call all the constructors in parent class by follow below
	// method.
	public B() {
		super();
	}

	public B(int i) {
		super(i);
	}

	public B(int i, int j) {
		super(i, j);
	}

	public static void main(String[] args) {
		B obj = new B();
		B obj1 = new B(10);
		B obj2 = new B(10, 20);

	}
}
