package oopsConceptsPart1;

public class CallByValueAndCallByReference {
	int p;
	int q;

	public static void main(String[] args) {
		
		CallByValueAndCallByReference obj= new CallByValueAndCallByReference();
		
		int x=10;
		int y=20;
		obj.testSum(x,y);// call by value OR Pass By Value
		
		obj.p=50;
		obj.q=60;
		obj.swap(obj);
		//after swap
		System.out.println(obj.p);
		System.out.println(obj.q);

	}
	//call by value OR Pass By Value---the copy of x and y will be given to a and b---not the Original Value
	public int testSum(int a, int b) {
		int c=a+b;
		return c;	
	}
	
	// call by Reference
	public void swap(CallByValueAndCallByReference t) {
		int temp;
		temp=t.p;//temp=50
		t.p=t.q;//t.p=60
		t.q=temp;//t.q=50
	}
}
