package encapsulation;

public class EmployeeData {
	// Encapsulation is also called----Data Hiding.
	// Encapsulation is a part of OOP.
	// PIE--Polymorphism--Inheritance--Encapsulation
	// How to implement Encapsulation:

	// 1.Private Data variables: So that these variables can't accessed directly
	// from outside the class.
	private int ssn;
	private String empName;
	private int empAge;

	public static void main(String[] args) {

		EmployeeData emp = new EmployeeData();
		emp.setEmpName("Tom Peter");
		emp.setEmpAge(25);
		emp.setSsn(23456);

		System.out.println("Employee Name is:  " + emp.getEmpName());
		System.out.println("Employee Age is:  " + emp.getEmpAge());
		System.out.println("Employee SSN is:  " + emp.getSsn());
	}

	// 2.Public getter and setter methods: To set and get the values of the fields.
	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

}
