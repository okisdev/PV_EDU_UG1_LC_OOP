
public class TestPatient {

	public static void main(String[] args) {
	
		Patient a = new Patient();
		Patient b = new Patient(123456, 18, "A+");
		
		display(a);
		display(b);
		
		a.setIDNumber(888888888);
		a.setAge(100);
		a.setBloodData("AB+");
		
		display(a);
	}
	
	public static void display(Patient p) {
		System.out.println("The patient's ID is " + p.getIDNumber() + ", Age is " + p.getAge() + ", and BloodType is " + p.getBloodData());
	}
	

}
