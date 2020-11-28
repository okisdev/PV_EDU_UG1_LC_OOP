
public class TestBloodData {

	public static void main(String[] args) {
		
		BloodData a = new BloodData();
		BloodData b = new BloodData("A", "+");
		
		display(a);
		display(b);
		
		a.setBloodType("AB");
		a.setRhFactor("-");
		
		display(a);
		
	}
	
	public static void display(BloodData bd) {
		System.out.println("The blood type is " + bd.getBloodType() + bd.getRhFactor() );
	}

}
