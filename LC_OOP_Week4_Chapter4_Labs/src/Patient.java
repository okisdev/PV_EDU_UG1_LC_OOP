
public class Patient {

	private int idNumber;
	private int age;
	private String bloodData;
	
	public Patient() {
		this(0, 0, "O+");
	}
	
	public Patient(int patientID, int patientAge) {
		idNumber = patientID;
		age = patientAge;
	}
	
	public Patient(int patientID, int patientAge, String patientBD) {
		idNumber = patientID;
		age = patientAge;
		bloodData = patientBD;
	}
	
	public void setIDNumber(int patientID) {
		idNumber = patientID;
	}
	
	public int getIDNumber() {
		return idNumber;
	}
	
	public void setAge(int patientAge) {
		age = patientAge;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setBloodData(String patientBD) {
		bloodData = patientBD;
	}
	
	public String getBloodData() {
		return bloodData;
	}
	
}
