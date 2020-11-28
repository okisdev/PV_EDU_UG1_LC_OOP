public class DeliveryPizza extends Pizza
{
   private String address;
   private double deliveryFee;
   private final int LOWFEE = 3;
   private final int HIGHFEE = 5;
   private final int CUTOFFPRICE = 15;
   DeliveryPizza(String desc, double pr, String address)
   {
      super(desc, pr);
      this.address = address;
      if(pr > CUTOFFPRICE)
         deliveryFee = LOWFEE;
      else
         deliveryFee = HIGHFEE;
   }
   public void display()
   {
      super.display();
      System.out.println("    Deliver to: " + address +
          ". Fee is " + deliveryFee);
   }
}
