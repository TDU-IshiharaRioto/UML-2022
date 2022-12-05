public class U1_K1 {
    public static void main (String[] args) {
        Student student1 = new Student ("s001", "Taro");
        Student student2 = new Student ("s002", "Hanako");
        System.out.println (student1.getId() + " " + student1.getName());
        System.out.println (student2.getId() + " " + student2.getName());
    }    
}
