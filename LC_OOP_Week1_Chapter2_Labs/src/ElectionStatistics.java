import java.util.*;
public class ElectionStatistics {
	
	public static void main(String[] args) {
		String Party1;
		String Party2;
		String Party3;
		int vote1;
		int vote2;
		int vote3;
		int totalVotes;
		double precentage1;
		double precentage2;
		double precentage3;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please type in the name of first party. ----->>>");
		Party1 = input.nextLine();
		System.out.println("Please type in the number of votes this party received. ----->>>");
		vote1 = input.nextInt();
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("Please type in the name of second party. ----->>>");
		Party2 = input1.nextLine();
		System.out.println("Please type in the number of votes this party received. ----->>>");
		vote2 = input1.nextInt();
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Please type in the name of third party. ----->>>");
		Party3 = input2.nextLine();
		System.out.println("Please type in the number of votes this party received. ----->>>");
		vote3 = input2.nextInt();
		
		totalVotes = vote1 + vote2 + vote3;
		
		precentage1 = (double) vote1 / totalVotes * 100;
		precentage2 = (double) vote2 / totalVotes * 100;
		precentage3 = (double) vote3 / totalVotes * 100;
		
		System.out.println(+totalVotes);
		
		System.out.println("Vote precentages for these three party are \n"
				+precentage1 + "% for " +Party1 + "\n"
				+precentage2 + "% for " +Party2 + "\n"
				+precentage3 + "% for " +Party3);
		
	}

}
