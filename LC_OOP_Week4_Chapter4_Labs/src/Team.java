
public class Team {

	private String highSchoolName;
	private String sport;
	private String teamName;
	private String mt;
	
	public final String MOTTO = "Sportsmanship!";
	
	public Team() {
		highSchoolName = "Roosevelt High School";
		sport = "Girls’ Basketball";
		teamName = "Dolphins";
		mt = MOTTO;
	}
	
	public Team(String hsn, String sp, String tn, String m) {
		highSchoolName = hsn;
		sport = sp;
		teamName = tn;
		mt = m;
	}
	
	public void setHighSchoolName(String hsn) {
		highSchoolName = hsn;
	}
	
	public String getHighSchoolName() {
		return highSchoolName;
	}
	
	public void setSport(String sp) {
		sport = sp;
	}
	
	public String getSport() {
		return sport;
	}
	
	public void setTeamName(String tn) {
		teamName = tn;
	}
	
	public String getTeamName() {
		return teamName;
	}
	
	public void setMotto(String m) {
		mt = m;
	}
	
	public String getMotto() {
		return mt;
	}
	
}
