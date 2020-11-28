import java.util.*;
public class BarChart {

	public static void main(String[] args) {
		int a, ap;
		int b, bp;
		int c, cp;
		int d, dp;
		int e, ep;
		
		String as = "*";
		String bs = "*";
		String cs = "*";
		String ds = "*";
		String es = "*";
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter points earned by Art >> ");
		a = input1.nextInt();
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter points earned by Bob >> ");
		b = input2.nextInt();
		
		Scanner input3 = new Scanner(System.in);
		System.out.println("Enter points earned by Cal >> ");
		c = input3.nextInt();
		
		Scanner input4 = new Scanner(System.in);
		System.out.println("Enter points earned by Dan >> ");
		d = input4.nextInt();
		
		Scanner input5 = new Scanner(System.in);
		System.out.println("Enter points earned by Eli >> ");
		e = input5.nextInt();
		
		System.out.println("Points for Games \n");
		
		for (ap = 0; ap < a; ap += 1 ) {
			as = as + "*";
		}
		System.out.println("Art \t" +as);
		
		for (bp = 0; bp < b; bp += 1 ) {
			bs = bs + "*";
		}
		System.out.println("Bob \t" +bs);
		
		for (cp = 0; cp < c; cp += 1 ) {
			cs = cs + "*";
		}
		System.out.println("Cal \t" +cs);
		
		for (dp = 0; dp < d; dp += 1 ) {
			ds = ds + "*";	
		}
		System.out.println("Dan \t" +ds);
		
		for (ep = 0; ep < a; ep += 1 ) {
			es = es + "*";	
		}
		System.out.println("Eli \t" +es);

	}

}
