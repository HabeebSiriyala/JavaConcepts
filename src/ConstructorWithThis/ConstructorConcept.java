package ConstructorWithThis;

public class ConstructorConcept {

	public ConstructorConcept() {
		System.out.println("Default Constructor");
	}

	public ConstructorConcept(int i) {
		System.out.println("Single parameter Constructor");
		System.out.println("the value of i:---" + i);
	}

	public ConstructorConcept(int i, int j) {
		System.out.println("Two parameters Constructor");
		System.out.println("the value of i:---" + i);
		System.out.println("the value of j:---" + j);
	}

	// Can we Overload the Constructor?----yes we can Overload constructor
	// how to call a constructor

	public static void main(String[] args) {

		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(10, 20);
	}
}
