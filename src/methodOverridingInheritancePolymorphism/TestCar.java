package methodOverridingInheritancePolymorphism;

public class TestCar {

	public static void main(String[] args) {
		
		//Static Polymorphism---- Compile Time Polymorphism
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine();
		
		System.out.println("**********");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		
		System.out.println("**********");
		
		//Top Casting/Up Casting
		// Child class Object can referred by Parent Class reference variable---Dynamic Polymorphism---Run-Time Polymorphism
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		
		//Down Casting
		//degrading parent Class Object to Child class object and then refer by child class reference variable
		//BMW b1 = (BMW)new Car();//java.lang.ClassCastException
		
		
		/*Method overloading is an example of compile time/static polymorphism
		  because method binding between method call and method definition happens at compile time 
		  and it depends on the reference of the class(reference created at compile time and goes to stack).
		  
		  Static polymorphism : Same method name is overloaded with different type or number of parameters 
		  in same class (different signature).Targeted method call is resolved at compile time.

		  method overriding is an example of run time/dynamic polymorphism 
		  because method binding between method call and method definition happens at run time 
		  and it depends on the object of the class (object created at runtime and goes to the heap).
		  
		  Dynamic polymorphism: Same method is overridden with same signature in different classes. 
		  Type of object on which method is being invoked is not known at compile time but will be decided at run time.
		*/
	}

}
