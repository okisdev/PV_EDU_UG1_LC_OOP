public class Fiction extends Book {

    @Override
    public void setPrice() {
        super.price = 24.99;
    }

    public Fiction(String title) {
        super(title);
        setPrice();
    }

}
