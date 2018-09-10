package interfaceMultipleInheritance;

public interface USBank {
	
	int min_bal = 100;
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	//Interface---->>>>
	//Only method declaration in interface
	//No method body---only method prototype
	//In interface, we declare the variables, variables are by default static in nature
	//variables value will not be changed---Its Final/constant or Static in Nature
	//No static method in interface
	//No Main method in interface
	//We can't create the object of interface
	//Interface is abstract in nature.
	
	//Interface---have Abstraction:
	//In interface always define only Abstract methods
	//No method Body
	//Only Method Declaration
	//we Achieve 100% Abstraction in interface

	
}
