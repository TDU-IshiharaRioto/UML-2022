public class RecordDB {
    public static EducateeList getEducateeList () {
        EducateeList educateeList = new EducateeList("�w�K�҃��X�g");
        Educatee educatee1 = new Educatee("s001", "Taro");
        Educatee educatee2 = new Educatee("s002", "Hanako");
        educateeList.add(educatee1);
        educateeList.add(educatee2);
        Subject subject1 = new Subject("UML���K");
        Subject subject2 = new Subject("UML���K");
        educatee1.add(subject1);
        educatee2.add(subject2);
        Task task1 = new Task("�ۑ�1");
        task1.setScore(90);
        task1.setNumber(1);
        Report report1 = new Report("���|�[�g1");
        report1.setScore(85);
        Test test1 = new Test("����");
        test1.setScore(95);
        subject1.add(task1);
        subject1.add(report1);
        subject1.add(test1);

        Task task2 =  new Task("�ۑ�1");
        task2.setScore(80);
        task2.setNumber(1);
        Report report2 = new Report("���|�[�g1");
        report2.setScore(90);
        Test test2 =  new Test("����");
        test2.setScore(100);
        subject2.add(task2);
        subject2.add(report2);
        subject2.add(test2);

        return educateeList;
    }
}
