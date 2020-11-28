import java.util.Scanner;
public class MileConversionsInteractive
{
   public static void main(String[] args)
   {
      final double INCHES_IN_MILE = 63360;
      final double FEET_IN_MILE = 5280;
      final double YARDS_IN_MILE = 1760;
      double miles = 4;
      double in, ft, yds;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter miles >> ");
      miles = input.nextDouble();
      in = miles * INCHES_IN_MILE;
      ft = miles * FEET_IN_MILE;
      yds = miles * YARDS_IN_MILE;
      System.out.println(miles + " miles is " + in + 
         " inches, or " + ft + " feet, or " + 
         yds + " yards");
   }
}