public class DemoPizzas
{
   public static void main(String args[])
   {
      Pizza p1 = new Pizza("sausage and onion", 14.99);
      Pizza p2 = new Pizza("green pepper", 12.99);
      DeliveryPizza p3 = new DeliveryPizza("cheese", 11.99, "22 Acorn");
      DeliveryPizza p4 = new DeliveryPizza("pepperoni, sausage, and pineapple", 19.50, "47 Oak");
      p1.display();
      p2.display();
      p3.display();
      p4.display();
   }
}
