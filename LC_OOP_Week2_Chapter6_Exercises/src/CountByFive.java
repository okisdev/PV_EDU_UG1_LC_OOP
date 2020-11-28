
public class CountByFive {

	public static void main(String[] args) {
		int x;
		
		for (x = 5; x < 500; x = x+5 ) {
			System.out.println(x);
			if (x%50==0)
				System.out.println();
			
		}

	}

}
