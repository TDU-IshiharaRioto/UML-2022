import java.util.ArrayList;
import java.util.List;

public class PetOwner {
    private String name;
    private List<Pet> list = new ArrayList<Pet>();
    public PetOwner (String name) {
        this.name = name;
    }
    public String getName () {
        return this.name;
    }
    public void add (Pet pet) {
        list.add (pet);
    }
    public Pet get (int index) {
        return list.get (index);
    }
    public Pet remove (int index) {
        return list.remove (index);
    }
    public int size () {
        return list.size();
    }
    public String talkToPets (String s) {
        String text = this.name + "[" + s + "]";
        for (int i = 0; i < size(); i++) {
            Pet pet = this.list.get(i);
            String result = pet.talk(s);
            if (result.equals("") != true) {
                text = text + " " + pet.getName() + "[" + result + "]";
            }
        }
        return text;
    }
}
