package stringImmutable;

public class StringConcept {

	public static void main(String[] args) {

		// ----Why String is Immutable and Final?
		//1.Existence of String Constant Pool
		//2.Thread Safety
		//3.Security
		//4.Class Loading
		//5.HashCode Caching
		
		// 1.String Pool in method Area
		// 2.Security
		// 3.Class loading Mechanism
		// 4.Optimization & Performance

		// Integer,Long,Double,Float--------Wrapper Classes-----Immutable and Final
		String s1 = "java";
		String s2 = "Java";
		s2 = "Habi";
		String s3 = "C++";

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
