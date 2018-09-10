package constructor;

class GFG {
	public static void main(String[] args) {
		// this would invoke default constructor.
		DefaultConstructor DC = new DefaultConstructor();

		// Default constructor provides the default
		// values to the object like 0, null
		System.out.println(DC.name);
		System.out.println(DC.num);
	}
}
