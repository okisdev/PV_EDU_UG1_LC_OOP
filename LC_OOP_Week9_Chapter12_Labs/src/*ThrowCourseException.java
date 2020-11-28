public class ThrowCourseException
{
   public static void main(String[] args)
   {
      Course[] courses = new Course[6];
      String[] depts = {"CIS", "ACC", "ENGLISH", "BB", "CIS", "ACC"};
      int[] courseNums = {110, 200, 100, 700, 599, 305};
      double[] credits ={3, 4, 7.5, 0, 100, 2.5};
      int x;
      for(x = 0; x < courses.length; ++x)
         courses[x] = new Course();
      for(x = 0; x < courses.length; ++x)
      {
         try
         {
            courses[x] = new Course(depts[x], courseNums[x], credits[x]);
         }
         catch(CourseException error)
         {
            System.out.println("Course " + x + "  Error: " + error.getMessage());
         }
      }
      System.out.println("\nCourse values");
      for(x = 0; x < courses.length; ++x)
         System.out.println(courses[x].toString());
   }
}