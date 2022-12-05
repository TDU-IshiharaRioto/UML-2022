public class Laboratory {
    private String name;
    private int number;
    public Laboratory (String name, int number) {
        this.name = name;
        this.number = number;
    }
    public void setName (String name) {
        this.name = name;
    }
    public String getName () {
        return this.name;
    }
    public void setNumber (int number) {
        this.number = number;
    }
    public int getNumber () {
        return this.number;
    }
}
