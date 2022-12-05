public class U2_K1 {
    public static void main(String[] args) {
        Laboratory laboratory1 = new Laboratory("AŒ¤‹†Žº", 50997);
        Laboratory laboratory2 = new Laboratory("BŒ¤‹†Žº", 50998);
        Laboratory laboratory3 = new Laboratory("CŒ¤‹†Žº", 50897);
        print (laboratory1);
        print (laboratory2);
        print (laboratory3);
    }
    public static void print (Laboratory laboratory) {
        System.out.println (laboratory.getName() + " " + laboratory.getNumber());
    }
}
