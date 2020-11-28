
public class DrugTests {

	public static void main(String[] args) {
		int testedEmployee;
		int week;
		
		
		for (week = 0; week < 52; week = week + 1) {
			testedEmployee = 1 + (int) (Math.random() * 30);
			System.out.print(testedEmployee + "\t");
			

			if (week % 4 == 0) 
                System.out.println();
		
		}

	}

}
