
public class FormLetterWriter {

	public static void main(String[] args) {
		
		displaySalutation("A");
		displayLetter();
		displaySalutation("C", "B");
		displayLetter();
	

	}
	
	public static void displaySalutation(String lastname) {
		
		System.out.println("Dear " + lastname);
	}
	
	public static void displaySalutation(String firstname, String lastname) {
		
		System.out.println("Dear " + firstname + " " + lastname);
	}
	
	public static void displayLetter() {
		System.out.println(" Thank you for your recent order.");
	}

}
