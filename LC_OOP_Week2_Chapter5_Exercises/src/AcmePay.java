import java.util.*;
public class AcmePay {

	public static void main(String[] args) {
		int whichShift;
		int reductPlan;
		
		double[] pay = {17, 18.5, 22};
		double pay1 = 17;
		double pay2 = 18.5;
		double pay3 = 22;
		
		double workhours;
		double extrahours;
		double payrate;
		double regularpay = 0;
		double overtimepay = 0;
		double netpay = 0;
		double retireDeduct = 0;
		double totalhourspay = 0;
		
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the shift worker are ------->>>");
		whichShift = input.nextInt();
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Please enter the worker's total working hours ------->>>");
		workhours = input2.nextInt();
		
		payrate = pay[whichShift];
		
		switch (whichShift) {
			case 1:
				if (workhours > 40) {
					extrahours = workhours - 40;
					overtimepay = extrahours * (17*1.5);
				} else {
					overtimepay = 0;
					
				}
				
				regularpay = workhours * 17;
				totalhourspay = regularpay + overtimepay;
				retireDeduct = 0;
				netpay = totalhourspay + retireDeduct;
			
				break;
				
			case 2:
				Scanner input3 = new Scanner(System.in);
				System.out.println("Would you like to join retirement plan? Please Yes or No.");
				reductPlan = input3.nextInt();
				
				if (workhours > 40) {
					extrahours = workhours - 40;
				} else {
					extrahours = 0;
				}
				
				overtimepay = extrahours * (18.5*1.5);
				regularpay = workhours * 18.5;
				totalhourspay = regularpay + overtimepay;
				
				if (reductPlan == 1) {
					retireDeduct = totalhourspay * 0.03;
				} else {
					retireDeduct = 0;
				}
				
				
				netpay = totalhourspay - retireDeduct;
				
				break;
				
			case 3:
				Scanner input4 = new Scanner(System.in);
				System.out.println("Would you like to join retirement plan? Please 1 for Yes or 2 for No.");
				reductPlan = input4.nextInt();
				
				if (workhours > 40) {
					extrahours = workhours - 40;
				} else {
					extrahours = 0;
				}
				
				overtimepay = extrahours * (22*1.5);
				regularpay = workhours * 22;
				totalhourspay = regularpay + overtimepay;
				
				if (reductPlan == 1) {
					retireDeduct = totalhourspay * 0.03;
				} else {
					retireDeduct = 0;
				}
				
				
				netpay = totalhourspay - retireDeduct;
				
				break;
				
		}
		
		System.out.println("This worker's "
				+ "total working hours is " +workhours + " ,\n"
				+ "shift is " +whichShift + " ,\n"
				+ "hourly pay rate is " +payrate + " ,\n"
				+ "regular pay is " +regularpay + " ,\n"
				+ "overtime pay is " +overtimepay + " ,\n"
				+ "total pay hours is " +totalhourspay + " ,\n"
				+ "retirement deduction is " +retireDeduct + " ,\n"
				+ "net pay is " +netpay + " .");

	}

}
