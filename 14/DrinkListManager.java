import java.util.ArrayList;
import java.util.List;

public class DrinkListManager {
    private DrinkList drinkList;
    
    public DrinkListManager (DrinkList drinkList) {
        this.drinkList = drinkList;
    }

    public void print () {
        int size = this.drinkList.size();
        for (int i = 0; i < size; i++) {
            Drink drink = this.drinkList.get(i);
            System.out.println (drink.getString());
        }
    }

    public Drink searchDrink (String keyName, String keyKind) {
        int size = this.drinkList.size();
        for (int i = 0; i < size; i++) {
            Drink drink = this.drinkList.get(i);
            String name = drink.getName();
            String kind = drink.getKind();
            if (keyName.equals(name) && keyKind.equals(kind)) {
                return drink;
            }
        }
        return null;
    }

    public List<Drink> searchDrinkByName (String keyName) {
        List<Drink> list = new ArrayList<Drink>();
        int size = this.drinkList.size();
        for (int i = 0; i < size; i++) {
            Drink drink = this.drinkList.get(i);
            String name = drink.getName();
            if (keyName.equals(name)) {
                list.add(drink);
            }
        }
        return list;
    }
}
