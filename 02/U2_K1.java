public class U2_K1 {
    public static void main(String[] args) {
        Laboratory laboratory1 = new Laboratory("A������", 50997);
        Laboratory laboratory2 = new Laboratory("B������", 50998);
        Laboratory laboratory3 = new Laboratory("C������", 50897);
        print (laboratory1);
        print (laboratory2);
        print (laboratory3);
    }
    public static void print (Laboratory laboratory) {
        System.out.println (laboratory.getName() + " " + laboratory.getNumber());
    }
}
