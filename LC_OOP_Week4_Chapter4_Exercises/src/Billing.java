
public class Billing {

	public static void main(String[] args) {
		

		computeBill(10);
		
		computeBill(10, 10);
		
		computeBill(10, 10, 10);

	}
	
	public static void computeBill(double price) {
		
		System.out.println("The price of one photo book ordered is " + price*1.08);
	}
	
	public static void computeBill(double price, int amount) {
		
		System.out.println("The price of all photo books ordered are " + price*amount*1.08);
	}
	
	public static void computeBill(double price, int amount, double vocher) {
		
		System.out.println("The price of all photo books ordered after couponing is " + (price*amount-vocher)*1.08);
	}

}
