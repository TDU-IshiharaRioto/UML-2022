import java.util.ArrayList;
import java.util.List;

public class PetOwner {
    private String name;
    private List<Pet> list = ArrayList<Pet>();
    public PetOwner (String name) {
        this.name = name;
    }
    public String getName () {
        return this.name;
    }
    public void add (Pet pet) {
        this.list.add (pet);
    }
    public Pet get (int index) {
        return this.list.get (index);
    }
    public Pet remove (int index) {
        return this.list.remove (index);
    }
    public int size () {
        return this.list.size();
    }
    public String talkToPets (String s) {
        return null;
    }
}