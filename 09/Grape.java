public class Grape implements Fruit{
    private String name;
    private int price;
    public Grape (String name) {
        this.name = name;
    }

    public String getName () {
        return this.name;
    }

    public void setPrice (int price) {
        this.price = price;
    }

    public int getPrice () {
        return this.price;
    }
}
