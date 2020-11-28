public class Pizza
{
   private String description;
   private double price;
   public Pizza(String desc, double pr)
   {
      description = desc;
      price = pr;
   }
   public void display()
   {
      System.out.println(description + " pizza   Price: $" + price);
   }
}