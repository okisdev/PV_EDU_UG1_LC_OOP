
public class DemoSalesperson {

	
	public static void main(String[] args) {
		
		Salesperson[] a = new Salesperson[10];
		
		for (int i = 0; i < a.length; i = i+1) {
			a[i] = new Salesperson(10, 1000);
			a[i].setIdNumber(1010+i);
			a[i].setAnnualSalesAmount(10+i);
			System.out.println(a[i].getIdNumber() + " " + a[i].getAnnualSalesAmount());
		}
		
	}
	
}
