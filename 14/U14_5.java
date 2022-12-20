public class U14_5 {
    public static void main(String[] args) {
        DrinkList drinkList = new DrinkList();
        DrinkListManager dm = new DrinkListManager(drinkList);
        drinkList.add(new Coffee("Colombian", 350));
        drinkList.add(new Tea("Java", 500));

        dm.print();
    }
}
