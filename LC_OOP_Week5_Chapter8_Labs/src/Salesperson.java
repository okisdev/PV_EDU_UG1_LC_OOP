
public class Salesperson {

	private static int idNumber = 9999;
	private static double annualSalesAmount = 0;
	
	public Salesperson(int id, double amount) {
		this.idNumber = id;
		this.annualSalesAmount = amount;
	}
	
	public static void setIdNumber(int id) {
		idNumber = id;
	}

	public static void setAnnualSalesAmount(double amount) {
		annualSalesAmount = amount;
	}

	public static int getIdNumber() {
		return idNumber;
	}

	public static double getAnnualSalesAmount() {
		return annualSalesAmount;
	}

}
