import java.util.List;

public class U14_7 {
    public static void main(String[] args) {
        DrinkList drinkList = new DrinkList();
        drinkList.add(new Coffee("Mocha", 300));
        drinkList.add(new Tea("Ceylon", 250));
        drinkList.add(new Coffee("Brazilian", 450));
        drinkList.add(new Tea("Assam", 400));
        drinkList.add(new Coffee("Colombian", 350));
        drinkList.add(new Tea("Java", 500));

        DrinkListManager dm = new DrinkListManager(drinkList);
        List<Drink> list = dm.searchDrinkByName("Tea");
        print (list);
    }

    public static void print (List<Drink> list) {
        for (Drink drink: list) {
            System.out.println (drink.getKind());
        }
    }
}
