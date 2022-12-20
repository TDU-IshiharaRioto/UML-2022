public class U14_4 {
    public static void main(String[] args) {
        DrinkList drinkList = new DrinkList();
        drinkList.add(new Coffee("Brazlian", 450));
        drinkList.add(new Tea("Assam", 400));

        print (drinkList);
    }

    public static void print (DrinkList drinkList) {
        int size = drinkList.size();
        for (int i = 0; i < size; i++) {
            Drink drink = drinkList.get(i);
            System.out.println (drink.getKind());
        }
    }
}
