public class U8_1 {
    public static void main(String[] args) {
        Subject subject = new Subject ("UML���K");
        subject.add (new Task ("�ۑ�"));
        subject.add (new Report ("���|�[�g1"));
        subject.add (new Test ("����"));
        subject.get(0).setScore(90);
        subject.get(1).setScore(85);
        subject.get(2).setScore(95);
        print (subject);
    }
    public static void print (Record record) {
        System.out.println (record.getName() + " " + record.getScore());
    }
    public static void print (Subject subject) {
        System.out.println (subject.getName());
        for (int i = 0; i < subject.size(); i++) {
            print (subject.get(i));
        }
    }
}
