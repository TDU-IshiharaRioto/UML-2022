public class U14_3 {
    public static void main(String[] args) {
        Coffee coffee = new Coffee("Mocha", 300);
        Tea tea = new Tea("Ceylon", 250);

        print (coffee);
        print (tea);
    }

    public static void print (Drink drink) {
        System.out.println (drink.getName() + " " + drink.getKind());
    }
}
