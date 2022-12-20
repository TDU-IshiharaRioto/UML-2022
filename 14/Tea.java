public class Tea implements Drink{
    private String name = "Tea";
    private String kind;
    private int price;

    public Tea (String kind, int price) {
        this.kind = kind;
        this.price = price;
    }

    @Override
    public String getKind () {
        return this.kind;
    }

    @Override
    public String getName () {
        return this.name;
    }

    @Override
    public int getPrice () {
        return this.price;
    }

    @Override
    public String getString () {
        return this.kind + " " + this.name + " " + this.price;
    }
}
