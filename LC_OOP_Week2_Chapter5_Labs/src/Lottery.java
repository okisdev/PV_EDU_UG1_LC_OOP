import java.util.*;
public class Lottery {

	public static void main(String[] args) {
		double randomNumber1, randomNumber2, randomNumber3;
		
		int outputNumber1, outputNumber2, outputNumber3;
		int inputNumber1, inputNumber2, inputNumber3;
		int earn = 0;
		

		randomNumber1 = Math.random();
		randomNumber2 = Math.random();
		randomNumber3 = Math.random();
		outputNumber1 = (int)(randomNumber1*9);
		outputNumber2 = (int)(randomNumber2*9);
		outputNumber3 = (int)(randomNumber3*9);
		

		Scanner input1 = new Scanner(System.in);
		System.out.println("Please enter your first number ----->>>");
		inputNumber1 = input1.nextInt();
	
		Scanner input2 = new Scanner(System.in);
		System.out.println("Please enter your second number ----->>>");
		inputNumber2 = input2.nextInt();
		
		Scanner input3 = new Scanner(System.in);
		System.out.println("Please enter your third number ----->>>");
		inputNumber3 = input3.nextInt();
	
		if ((inputNumber1 != outputNumber1)&&(inputNumber1 != outputNumber2)&&(inputNumber1 != outputNumber3) 
				&&(inputNumber2 != outputNumber1)&&(inputNumber2 != outputNumber2)&&(inputNumber2 != outputNumber3)
				&&(inputNumber3 != outputNumber1)&&(inputNumber3 != outputNumber2)&&(inputNumber3 != outputNumber3))
			earn = 0;
		else if ((inputNumber1 == outputNumber1)&&(inputNumber1 != outputNumber2)&&(inputNumber1 != outputNumber3)
				&&(inputNumber2 != outputNumber1)&&(inputNumber2 != outputNumber2)&&(inputNumber2 != outputNumber3)
				&&(inputNumber3 != outputNumber1)&&(inputNumber3 != outputNumber2)&&(inputNumber3 != outputNumber3))
			earn = 1;
		else if ((inputNumber1 != outputNumber1)&&(inputNumber1 == outputNumber2)&&(inputNumber1 != outputNumber3)
				&&(inputNumber2 != outputNumber1)&&(inputNumber2 != outputNumber2)&&(inputNumber2 != outputNumber3)
				&&(inputNumber3 != outputNumber1)&&(inputNumber3 != outputNumber2)&&(inputNumber3 != outputNumber3))
			earn = 1;
		else if ((inputNumber1 == outputNumber1)&&(inputNumber1 != outputNumber2)&&(inputNumber1 != outputNumber3)
				&&(inputNumber2 != outputNumber1)&&(inputNumber2 == outputNumber2)&&(inputNumber2 != outputNumber3)
				&&(inputNumber3 != outputNumber1)&&(inputNumber3 != outputNumber2)&&(inputNumber3 != outputNumber3))
			earn = 1;
		else if ((inputNumber1 != outputNumber1)&&(inputNumber1 != outputNumber2)&&(inputNumber1 != outputNumber3)
				&&(inputNumber2 != outputNumber1)&&(inputNumber2 != outputNumber2)&&(inputNumber2 != outputNumber3)
				&&(inputNumber3 != outputNumber1)&&(inputNumber3 != outputNumber2)&&(inputNumber3 != outputNumber3))
			earn = 2;
		else if ((inputNumber1 != outputNumber1)&&(inputNumber1 != outputNumber2)&&(inputNumber1 != outputNumber3)
				&&(inputNumber2 != outputNumber1)&&(inputNumber2 != outputNumber2)&&(inputNumber2 != outputNumber3)
				&&(inputNumber3 != outputNumber1)&&(inputNumber3 != outputNumber2)&&(inputNumber3 != outputNumber3))
			earn = 3;
		
		
		
		System.out.println("The random numbers are " + outputNumber1 + " " + outputNumber2 + " " + outputNumber3);
		System.out.println("The numbers you enter are " + inputNumber1 + " " + inputNumber2 + " " + inputNumber3);
		System.out.println("You total earn " + earn + " point(s).");

	}

}
