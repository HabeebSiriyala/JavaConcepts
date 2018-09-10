package oopsConceptsPart1;

public class WrapperClassConcept {

	/*Wrapper classes are used to convert any data type into an object.
	  The primitive data types are not objects; they do not belong to any class; 
	  they are defined in the language itself. 
	  Sometimes, it is required to convert data types into objects in Java language
	  */
	public static void main(String[] args) {

		String x = "100";
		System.out.println(x + 20);

		// Data Conversion String To integer
		int i = Integer.parseInt(x);
		System.out.println(i + 20);

		// Integer, Double, Character, Boolean

		// String To Double Conversion
		String y = "12.33";
		double d = Double.parseDouble(y);
		System.out.println(d + 10);

		// String to Boolean Conversion
		String k = "True";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);

		// Int to String Conversion
		int j = 200;
		System.out.println(j + 20);

		String s = String.valueOf(j); // 200
		System.out.println(s + 20);

		String u = "100K";
		//Integer.parseInt(u);// -->java.lang.NumberFormatException

	}

}
