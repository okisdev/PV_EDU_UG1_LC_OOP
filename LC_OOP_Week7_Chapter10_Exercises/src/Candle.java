public class Candle {

    String colour;
    double height;
    double price;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        this.price = 2.00 * height;
    }

    public double getPrice() {
        return price;
    }
}
