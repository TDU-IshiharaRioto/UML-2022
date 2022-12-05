public class U5_4 {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        studentList.add (new Student("s001", "Taro"));
        studentList.add (new Student("s002", "Hanako"));
        studentList.add (new Student("s003", "Jiro"));
        print (studentList);
    }
    public static void print (StudentList studentList) {
        for (int i = 0; i < studentList.size(); i++) {
            Student temp = studentList.get(i);
            System.out.println (temp.getId() + " " + temp.getName());
        }
    }
}
