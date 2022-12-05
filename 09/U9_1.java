public class U9_1 {
    public static void main(String[] args) {
        Subject subject = new Subject("UML‰‰K");
        Task task = new Task("‰Û‘è1");
        task.setNumber(1);
        task.setScore(90);
        Report report = new Report("ƒŒƒ|[ƒg1");
        report.setScore(85);
        Test test = new Test("Œ±");
        test.setScore(95);
        subject.add(task);
        subject.add(report);
        subject.add(test);

        print(subject);
    }

    public static void print (Subject subject) {
        int size = subject.size();
        for (int i = 0; i < size; i++) {
            Record record = subject.get(i);
            System.out.println (record.getName() + " " + record.getScore());
        }
    }
}
