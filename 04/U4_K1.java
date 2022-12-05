public class U4_K1 {
    public static void main(String[] args) {
        StudentList list = new StudentList();
        list.add (new Student("s001", "Taro"));
        list.add (new Student("s002", "Hanako"));
        list.add (new Student("s003", "Jiro"));
        print (list);
    }
    public static void print (StudentList studentList) {
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println (studentList.get(i).getId() + " " + studentList.get(i).getName());
        }
    }
}
