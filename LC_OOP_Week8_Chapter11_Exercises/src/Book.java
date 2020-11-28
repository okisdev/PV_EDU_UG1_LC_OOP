public abstract class Book {

    String title;
    double price;

    public Book(String theBookTitle) {
        title = theBookTitle;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public abstract void setPrice();

}
