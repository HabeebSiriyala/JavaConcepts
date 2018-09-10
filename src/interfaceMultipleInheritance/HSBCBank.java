package interfaceMultipleInheritance;

public class HSBCBank implements USBank,BrazilBank {//we are achieving multiple inheritance 
	//Is-a-Relationship--->> Interface and Class Relationship

	//If a class is Implementing any interface, 
	//Then Its mandatory to define/override all the methods of interface Overriding form USBank
	public void credit() {
		System.out.println("HSBC----Credit");
	}

	public void debit() {
		System.out.println("HSBC----Debit");
	}

	public void transferMoney() {
		System.out.println("HSBC----transferMoney");
	}
	
	//Separate methods of HSBCBank class
	public void educationLoan() {
		System.out.println("HSBC----EducationLoan");
	}
	
	public void carLoan() {
		System.out.println("HSBC-----CarLoan");
	}

	//BrazilBank Method: Overriding from BrazilBank
	public void mutualFund() {
		System.out.println("HSBC----Mutual Fund");
	}
}
