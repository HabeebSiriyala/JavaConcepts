package finalFinalizeFinallyConcepts;

public class FinalizeConcept {

	public void finalize() {
		System.out.println("finalize method");
	}
	// Finalize is a method
	public static void main(String[] args) {

		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		FinalizeConcept f3 = new FinalizeConcept();
		
		f1 = null;
		f2 = null;
		f3 = null;

		System.gc();
	}
}
