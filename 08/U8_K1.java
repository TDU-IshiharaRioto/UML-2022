public class U8_K1 {
    public static void main(String[] args) {
        Subject subject = new Subject("コンピュータプログラミング");
        subject.add (new Report ("レポート1"));
        subject.add (new Report ("レポート2"));
        subject.add (new Report ("レポート3"));
        subject.add (new Test ("試験"));
        subject.get(0).setScore(85);
        subject.get(1).setScore(80);
        subject.get(2).setScore(90);
        subject.get(3).setScore(95);
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
