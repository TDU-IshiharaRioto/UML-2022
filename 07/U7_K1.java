public class U7_K1 {
    public static void main(String[] args) {
        PetOwner petOwner = new PetOwner("���Y");
        petOwner.add (new Dog ("�|�`"));
        petOwner.add (new Cat ("�^�}"));

        System.out.println (petOwner.talkToPets("�|�`�@����"));
        System.out.println (petOwner.talkToPets("�^�}�@����ɂ���"));
        System.out.println (petOwner.talkToPets("�^�}�@�|�`�@���͂񂾂�"));
    }
}
