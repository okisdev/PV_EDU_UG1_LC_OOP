public class NonFiction extends Book {

    @Override
    public void setPrice() {
        super.price = 37.99;
    }

    public NonFiction(String title) {
        super(title);
        setPrice();

    }

}
