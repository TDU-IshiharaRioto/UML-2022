public class U3_K1 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("t001", "情報太郎");
        teacher.setLaboratory (new Laboratory("A研究室", 50997));
        print (teacher);
    }
    public static void print (Teacher teacher) {
        System.out.println ("職番：" + teacher.getId());
        System.out.println ("教員名：" + teacher.getName());
        System.out.println ("研究室名：" + teacher.getLaboratory().getName());
        System.out.println ("部屋番号：" + teacher.getLaboratory().getNumber());
    }
}
