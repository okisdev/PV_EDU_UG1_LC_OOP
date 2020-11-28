
public class TriangleWithLoops {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		
		for (a = 0; a < 8; a += 1) {
			
			for (b = 0; b < 7 - a; b += 1) {
				System.out.print(" "); // For Space
			}
			
			for (c = 1; c <=  2*a-1; c += 1) {
				System.out.print("T"); // For T
			}
			
			System.out.println();
		}
	

	}

}
