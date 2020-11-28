import java.util.*;
public class ShadyRestRoom {

	public static void main(String[] args) {
		int a;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Price and Type of the Rooms are shown as follows. \n"
				+ "\n"
				+ "$125 for Queen, $139 for King, and $165 for Suite with king bed and a pullout couch.\n"
				+ "\n"
				+ "If you want to choose Queen Room, please enter 1 \n"
				+ "If you want to choose King Room, please enter 2 \n"
				+ "If you want to choose Suite, please enter 3");
		a = input.nextInt();
		
		switch(a) {
			case 1:
				System.out.println("You choose a Queen Room, the price is $125.");
				break;
				
			case 2:
				System.out.println("You choose a King Room, the price is $125.");
				break;
				
			case 3:
				System.out.println("You choose a Suite, the price is $125.");
				break;
				
			default:
				System.out.println("You enter an invaild number, the price is $0.");
				break;
		
		}
		
		
		

	}

}
