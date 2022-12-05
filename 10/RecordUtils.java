public class RecordUtils {
    public static void print (EducateeList educateeList) {
        System.out.println (educateeList.getName());
        for (int i = 0; i < educateeList.size(); i++) {
            Educatee educatee = educateeList.get(i);
            RecordUtils.print(educatee);
        }
    }

    public static void print (Educatee educatee) {
        System.out.println(educatee.getId() + " " + educatee.getName());
        for (int i = 0; i < educatee.size(); i++) {
            Subject subject = educatee.get(i);
            RecordUtils.print(subject);
        }
    }

    public static void print (Subject subject) {
        System.out.println (subject.getName());
        for (int i = 0; i < subject.size(); i++) {
            Record record = subject.get(i);
            RecordUtils.print(record);
        }
    }

    public static void print (Record record) {
        System.out.println (record.getName() + " " + record.getScore());

    }
}
