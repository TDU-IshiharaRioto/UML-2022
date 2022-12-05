public class U5_K1 {
    public static void main(String[] args) {
        TeacherList teacherList = new TeacherList ();
        teacherList.add (new Teacher("t001", "��񑾘Y"));
        teacherList.add (new Teacher("t002", "�d��Ԏq"));
        teacherList.get (0).setLaboratory (new Laboratory("A������", 50997));
        teacherList.get (1).setLaboratory (new Laboratory("B������", 50998));
        print (teacherList);
    }
    public static void print (TeacherList teacherList) {
        for (int i = 0; i < teacherList.size(); i++) {
            Teacher tempTeacher = teacherList.get(i);
            Laboratory tempLaboratory = tempTeacher.getLaboratory(); 
            System.out.println(tempTeacher.getId() + " " + tempTeacher.getName() + " " + tempLaboratory.getName() + " " + tempLaboratory.getNumber());
        }
    }
}
