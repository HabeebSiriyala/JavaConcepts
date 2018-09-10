package javaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		
		//1.While Loop
		//disadvantage of while loop is---It will generate the infinite loop if u don't give incremental/decremental part
		int i=1; //Initialization
		while(i<=10) { //conditional
			System.out.println(i);
			i=i+1; //Incremental/Decremental
		}
		System.out.println("*************");
		
		//j++ means j=j+1
		//2.For Loop
		for(int j=1;j<=10;j++) { //Initialization, conditional,  Incremental/Decremental
			System.out.println(j);
		}
		System.out.println("**************");
		//print 10 to 1
		// k means k=k-1
		//10 9 8 7 6 5 4 3 2 1
		for(int k=10;k>=1;k--) {
			System.out.println(k);
		}

	}

}
