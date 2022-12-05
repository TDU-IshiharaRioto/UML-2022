public class U9_K1 {
    public static void main(String[] args) {
        FruitBasket fruitBasket = new FruitBasket();
        Apple apple = new Apple ("ふじ");
        apple.setPrice (300);
        Apple apple2 = new Apple ("つがる");
        apple2.setPrice (350);
        Grape grape = new Grape ("シャインマスカット");
        grape.setPrice (800);
        fruitBasket.add (apple);
        fruitBasket.add (apple2);
        fruitBasket.add (grape);

        print (fruitBasket);
    }

    public static void print (FruitBasket fruitBasket) {
        System.out.println (fruitBasket.getNames());
        System.out.println (fruitBasket.getTotalPrice());
    }
}
