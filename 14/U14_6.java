public class U14_6 {
    public static void main(String[] args) {
        DrinkList drinkList = new DrinkList();
        drinkList.add(new Coffee("Mocha", 300));
        drinkList.add(new Tea("Ceylon", 250));
        drinkList.add(new Coffee("Brazilian", 450));
        drinkList.add(new Tea("Assam", 400));
        drinkList.add(new Coffee("Colombian", 350));
        drinkList.add(new Tea("Java", 500));

        String keyName = "Tea";
        String keyKind = "Java";
        DrinkListManager dm = new DrinkListManager(drinkList);
        Drink drink = dm.searchDrink(keyName, keyKind);
        if (drink != null) {
            System.out.println (drink.getString());
        } else {
            System.out.println ("no data");
        }
    }
}
