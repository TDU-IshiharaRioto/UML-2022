public class U9_2 {
    public static void main(String[] args) {
        FruitBasket fruitBasket = new FruitBasket();
        Peach peach1 = new Peach ("Ç‡Ç‡");
        peach1.setPrice (250);
        Peach peach2 = new Peach ("îíìç");
        peach2.setPrice (300);
        Kiwi kiwi = new Kiwi ("ÉLÉEÉC");
        kiwi.setPrice (91);
        fruitBasket.add (peach1);
        fruitBasket.add (peach2);
        fruitBasket.add (kiwi);

        print(fruitBasket);
    }

    public static void print (FruitBasket fruitBasket) {
        System.out.println (fruitBasket.getNames());
        System.out.println (fruitBasket.getTotalPrice());
    }
}
