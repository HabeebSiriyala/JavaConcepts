package javaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList();
		
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2
		
		System.out.println(ar.size());
		
		ar.add(400);//3
		ar.add(500);//4
		
		System.out.println(ar.size());
		
		ar.add("Habeeb");//5
		ar.add("Hello");//6
		ar.add(12.33);//7
		ar.add('M');//8
		ar.add(900);
		
		System.out.println(ar.size());
		ar.remove(9);
		System.out.println(ar.size());
		
		//get method is pass the value/pass the index
		System.out.println(ar.get(4));
		//System.out.println(ar.get(9));//IndexOutOfBoundsException
		
		//To print all the values of ArrayList: For Loop
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		//ar1.add("habeeb")
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("habeeb");
		//ar2.add(100);
		
		
		
		
		
	}

}
