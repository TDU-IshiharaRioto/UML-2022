public class RecordDB {
    public static EducateeList getEducateeList () {
        EducateeList educateeList = new EducateeList("学習者リスト");
        Educatee educatee1 = new Educatee("s001", "Taro");
        Educatee educatee2 = new Educatee("s002", "Hanako");
        educateeList.add(educatee1);
        educateeList.add(educatee2);
        Subject subject1 = new Subject("UML演習");
        Subject subject2 = new Subject("UML演習");
        Subject subject3 = new Subject("データ形式");
        educatee1.add(subject1);
        educatee2.add(subject2);
        educatee1.add(subject3);

        Task task1 = new Task("課題1");
        task1.setScore(90);
        task1.setNumber(1);
        Report report1 = new Report("レポート1");
        report1.setScore(85);
        Test test1 = new Test("試験");
        test1.setScore(95);
        subject1.add(task1);
        subject1.add(report1);
        subject1.add(test1);

        Task task2 =  new Task("課題1");
        task2.setScore(80);
        task2.setNumber(1);
        Report report2 = new Report("レポート1");
        report2.setScore(90);
        Test test2 =  new Test("試験");
        test2.setScore(100);
        subject2.add(task2);
        subject2.add(report2);
        subject2.add(test2);

        Task task3 = new Task("課題1");
        task3.setScore(75);
        task3.setNumber(1);
        Report report3 = new Report("レポート1");
        report3.setScore(70);
        Test test3 = new Test("試験");
        test3.setScore(80);
        subject3.add(task3);
        subject3.add(report3);
        subject3.add(test3);
        
        return educateeList;
    }
}
