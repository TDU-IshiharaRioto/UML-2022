public class Animal {
    private String name;
    private int weight;

    public Animal (String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getName () {
        return this.name;
    }

    public void setWeight (int weight) {
        this.weight = weight;
    }

    public int getWeight () {
        return this.weight;
    }
}
