package javaBasics;

public class ArrayConcept {

	public static void main(String[] args) {

		// Arrray--- is Store the similar Data type values in an array variable

		// 1.int array:
		// lowest bound/index=0
		// upper bound/index = n-1(n is the size of array)
		// One Dimensional Array

		// Advantages---I can Store multiple values in an single array variable
		// disadvantagesOf Array
		// 1.Size is fixed---Static Array---to overcome this problem---we use
		// Collections(Array List, Hash table)Dynamic Array
		// 2.Stores Only Similar DataTypes---to overcome this problem---we use Object Array
		
		int i[] = new int[5];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		i[4] = 50;
		System.out.println(i[2]);
		System.out.println(i[4]);
		// System.out.println(i[5]);//java.lang.ArrayIndexOutOfBoundsException
		System.out.println(i.length);// size or length of an array

		// print all the values of an array: Use For Loop
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}

		// 2.double array:
		double d[] = new double[4];
		d[0] = 100.1;
		d[1] = 200.2;
		d[2] = 300.3;
		d[3] = 400.4;
		System.out.println(d[2]);

		// 3.Char Aarray
		char c[] = new char[3];
		c[0] = 'w';
		c[1] = 'q';
		c[2] = 's';
		System.out.println(c[1]);

		// 4.boolean Array
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;
		System.out.println(b[0]);

		// 5.String Array
		String s[] = new String[3];
		s[0] = "test";
		s[1] = "Hello";
		s[2] = "World";
		System.out.println(s[2]);
		System.out.println(s.length);

		// 6.Object Array:(Object is a class)----is used to store different data type
		// values
		Object obj[] = new Object[6];
		obj[0] = "Habeeb";
		obj[1] = 25;
		obj[2] = 12.11;
		obj[3] = "01/01/1999";
		obj[4] = 'm';
		obj[5] = "Bangalore";
		System.out.println(obj[0]);
		System.out.println(obj[5]);
	}

}
