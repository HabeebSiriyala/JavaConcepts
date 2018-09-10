package singletonDesignPattern;

public class Singleton {

	// In OOPS, A Singleton class is a class that can have only once Object(instance
	// of the class) at a time
	// How to design Singleton Class:
	// 1.Make sure the Constructor as a private
	// 2.write a static method(getInstance) that has return type of object of this
	// Singleton class(Lazy Initialization)

	// Difference Between Normal Class and Singleton Class:
	// for Normal Class we use Constructor where as for Singleton class we use
	// getInstance Method For instantiation

	private static Singleton singleton_instance = null;
	public String str;

	private Singleton() {
		str = "Hey I am using singleton class pattern";
	}

	public static Singleton getInstance() {
		if (singleton_instance == null) {
			singleton_instance = new Singleton();
			return singleton_instance;
		}
		return singleton_instance;
	}
	public static void main(String[] args) {

		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();

		x.str = (x.str).toUpperCase();

		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);

		z.str = (z.str).toLowerCase();

		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
	}
}
