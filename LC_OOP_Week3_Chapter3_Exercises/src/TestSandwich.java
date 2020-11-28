
public class TestSandwich {

	public static void main(String[] args) {
		
		Sandwich a = new Sandwich();
		
		a.setMainIngredient("tuna");
		a.setBreadType("wheat");
		a.setPrice(4.99);



		System.out.print("Sandwich a is " + a.getPrice());
		
	}
}
