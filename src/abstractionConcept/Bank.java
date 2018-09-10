package abstractionConcept;

public abstract class Bank {
	
	int amt = 100;
	final int rate = 10;
	static int loanRate = 5;
	
	//Partial Abstraction---
	//Abstraction--- Hiding the Implementation Logic----is called Abstraction(OOPS Concept).
	//Abstract class---- can have Abstract methods and Non-Abstract methods
	//We can't create the object of Abstract Classes.

	 
	public abstract void  loan();//abstract method-----No Method Body
	
	//Non Abstract Methods
	public void credit() {
		System.out.println("Bank-----credit method");
	}
	
	public void debit() {
		System.out.println("Bank-----Debit method");
	}

}
