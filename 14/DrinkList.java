import java.util.ArrayList;
import java.util.List;

public class DrinkList {
    private List<Drink> list = new ArrayList<Drink>();
    
    public DrinkList () {

    }

    public void add (Drink food) {
        this.list.add(food);
    }

    public Drink get (int index) {
        return this.list.get(index);
    }

    public Drink remove (int index) {
        return this.list.remove(index);
    }

    public int size () {
        return this.list.size();
    }
}
