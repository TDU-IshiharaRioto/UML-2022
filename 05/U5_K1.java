public class U5_K1 {
    public static void main(String[] args) {
        TeacherList teacherList = new TeacherList ();
        teacherList.add (new Teacher("t001", "î•ñ‘¾˜Y"));
        teacherList.add (new Teacher("t002", "“d‘å‰Ôq"));
        teacherList.get (0).setLaboratory (new Laboratory("AŒ¤‹†º", 50997));
        teacherList.get (1).setLaboratory (new Laboratory("BŒ¤‹†º", 50998));
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
