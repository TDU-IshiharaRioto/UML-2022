import java.util.List;
import java.util.ArrayList;

public class FruitBasket {
    private List<Fruit> list = new ArrayList<Fruit>();
    public FruitBasket () {

    }

    public void add (Fruit fruit) {
        this.list.add(fruit);
    }
    
    public Fruit get (int index) {
        return this.list.get(index);
    }

    public int size () {
        return this.list.size();
    }

    public Fruit remove (int index) {
        return this.list.remove (index);
    }

    public String getNames () {
        String result = "";
        for (int i = 0; i < this.list.size(); i++) {
            result = result + this.list.get(i).getName() + " ";
        }
        return result;
    }

    public int getTotalPrice () {
        int total = 0;
        for (int i = 0; i < this.list.size(); i++) {
            total = total + this.list.get(i).getPrice();
        }
        return total;
    }
}
