package dishes;

public abstract class Dishes {
    protected String manufacturer;
    protected double price;
    protected String style;

    public Dishes(String manufacturer, double price, String style) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.style = style;
    }

    public Dishes(String manufacturer, double price) {
        this(manufacturer, price, "Неизвестно");
    }

    public Dishes() {
        this("Неизвестно", 0.0, "Неизвестно");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public String getStyle() {
        return style;
    }

    public abstract String getName();

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}
