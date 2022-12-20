import java.util.List;
import java.util.ArrayList;

public class AnimalList {
    private List<Animal> list = new ArrayList<Animal>();

    public AnimalList () {

    }

    public void add (Animal animal) {
        this.list.add (animal);
    }

    public Animal get (int index) {
        return this.list.get(index);
    }

    public Animal remove (int index) {
        return this.list.remove (index);
    }

    public int size () {
        return this.list.size();
    }
}