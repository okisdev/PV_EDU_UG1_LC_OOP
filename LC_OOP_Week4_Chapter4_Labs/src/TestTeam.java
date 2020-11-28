
public class TestTeam {

	public static void main(String[] args) {
		
		Team a = new Team();
		Team b = new Team("a", "b", "c", "d!");
		
		display(a);
		display(b);
		
		a.setHighSchoolName("aa");
		a.setSport("bb");
		a.setTeamName("cc");
		a.setMotto("dd!");
		
		display(a);
	}
	
	public static void display(Team a) {
		System.out.println("This team is from " + a.getHighSchoolName() + ", this Sport is " + a.getSport() + ", Team Name is " + a.getTeamName() + ", and also their Motto is " + a.getMotto());
	}

}
