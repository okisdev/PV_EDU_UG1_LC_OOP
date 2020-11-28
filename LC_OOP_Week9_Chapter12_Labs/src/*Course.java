public class Course
{
   String department;
   int courseNumber;
   double credits;
   final int DEPT_LENGTH = 3;
   final int LOW_NUM = 100;
   final int HIGH_NUM = 499;
   final double LOW_CREDITS = 0.5;
   final double HIGH_CREDITS = 6;
   public Course()
   {
      department = "";
      courseNumber = 0;
      credits = 0;
   }
   public Course(String dept, int num, double creditValue) throws CourseException
   {
      boolean isBad = false;
      String msg = "";
      department = dept;
      courseNumber = num;
      credits = creditValue;
      if(dept.length() != DEPT_LENGTH)
         msg += "\nDepartment code number must be three characters ";
      if(num < LOW_NUM || num > HIGH_NUM)
         msg += "\nCourse number out of range ";
      if(creditValue < LOW_CREDITS || creditValue > HIGH_CREDITS)
         msg += "\nCredits out of range ";
      if(!msg.equals(""))
         throw(new CourseException(msg + "\n   " + department + courseNumber +
            "  Credits " + credits));
    }
   public String toString()
   {
      return  department + courseNumber + "  Credits " + credits;
   }
}