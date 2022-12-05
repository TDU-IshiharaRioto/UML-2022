public class U7_K1 {
    public static void main(String[] args) {
        PetOwner petOwner = new PetOwner("太郎");
        petOwner.add (new Dog ("ポチ"));
        petOwner.add (new Cat ("タマ"));

        System.out.println (petOwner.talkToPets("ポチ　お手"));
        System.out.println (petOwner.talkToPets("タマ　こんにちは"));
        System.out.println (petOwner.talkToPets("タマ　ポチ　ごはんだよ"));
    }
}
