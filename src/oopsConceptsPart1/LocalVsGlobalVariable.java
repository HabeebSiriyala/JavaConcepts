package oopsConceptsPart1;

public class LocalVsGlobalVariable {

	// Global Variables-------class variables
	String name = "Tom";
	int age = 25;

	public static void main(String[] args) {
		int i = 10;// local variable
		System.out.println(i);

		LocalVsGlobalVariable obj = new LocalVsGlobalVariable();
		System.out.println(obj.name);
		System.out.println(obj.age);
	}

	public void sum() {
		// int i=10; // local var for sum method
		// int j=20;
		// int age=25;
	}

}
