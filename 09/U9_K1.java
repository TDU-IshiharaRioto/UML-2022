public class U9_K1 {
    public static void main(String[] args) {
        FruitBasket fruitBasket = new FruitBasket();
        Apple apple = new Apple ("�ӂ�");
        apple.setPrice (300);
        Apple apple2 = new Apple ("����");
        apple2.setPrice (350);
        Grape grape = new Grape ("�V���C���}�X�J�b�g");
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
