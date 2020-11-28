

class Lease {
	
	private String tenantName = "XXX";
	private int houseNumber = 0;
	private double rentFee = 1000;
	private int rentMonths = 12;
	private static final int petFee = 10;
	
	public Lease() {
		tenantName = "XXX";
		houseNumber = 0;
		rentFee = 1000;
		rentMonths = 12;
	}
	
	public void setName(String name) {
		tenantName = name;
	}
	
	public String getName() {
		return tenantName;
	}

	public void setNumber(int number) {
		houseNumber = number;
	}
	
	public int getNumber() {
		return houseNumber;
	}
	
	public void setRentFee(double rent) {
		rentFee = rent;
	}
	
	public double getRent() {
		return rentFee;
	}
	
	public void setRentMonths(int months) {
		rentMonths = months;
	}
	
	public int getMonths() {
		return rentMonths;
	}
	
	public void addPetFee() {
		rentFee = rentFee + petFee;
		explainPetPolicy();
	}
	
	public static void explainPetPolicy() {
		System.out.println("\nA pet fee of $" + petFee + " is added to the monthly rent.");
	}
	
	
	
}
