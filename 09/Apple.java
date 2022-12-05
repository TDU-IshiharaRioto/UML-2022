public class Apple implements Fruit {
    private String name;
    private int price;
    public Apple (String name) {
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
