package interfaceMultipleInheritance;

public class TestBank {

	public static void main(String[] args) {

		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationLoan();
		hs.carLoan();
		
		System.out.println("******************************");
		
		//Dynamic Polymorphism
		//Child Class Object Can be referred by parent interface reference variable.
		USBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
	}
}
