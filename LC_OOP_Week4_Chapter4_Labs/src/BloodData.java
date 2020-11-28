
public class BloodData {

	private String bloodType;
	private String rhFactor;

	public BloodData() {
		this("O", "+"); 
	}
	
	public BloodData(String type, String factor) {
		bloodType = type;
		rhFactor = factor;
	}
	
	public void setBloodType(String type) {
		bloodType = type;
	}
	
	public String getBloodType() {
		return bloodType;
	}
	
	public void setRhFactor(String factor) {
		rhFactor = factor;
	}

	public String getRhFactor() {
		return rhFactor;
	}
}