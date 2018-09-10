package ConstructorWithSuper;

public class A {

	public A() {
		System.out.println("Parent Class Constant");
	}

	public A(int i) {
		System.out.println("Parent Class Constant with value of i:---" + i);
	}

	public A(int i, int j) {
		System.out.println("Parent Class Constant with value of j:---" + j);
		System.out.println("Parent Class Constant with value of i:---" + i);
	}
}
