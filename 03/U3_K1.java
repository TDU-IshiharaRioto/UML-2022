public class U3_K1 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("t001", "��񑾘Y");
        teacher.setLaboratory (new Laboratory("A������", 50997));
        print (teacher);
    }
    public static void print (Teacher teacher) {
        System.out.println ("�E�ԁF" + teacher.getId());
        System.out.println ("�������F" + teacher.getName());
        System.out.println ("���������F" + teacher.getLaboratory().getName());
        System.out.println ("�����ԍ��F" + teacher.getLaboratory().getNumber());
    }
}
