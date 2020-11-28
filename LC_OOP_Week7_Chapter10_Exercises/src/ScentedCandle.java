public class ScentedCandle extends Candle {

    String scent;

    public String getScent() {
        return scent;
    }

    public void setScent(String scent) {
        this.scent = scent;
    }

    public void setHeight(double height) {
        super.height = height;
        super.price = 3.00 * height;
    }
}
