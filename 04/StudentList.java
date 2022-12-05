import java.util.ArrayList;
import java.util.List;

public class StudentList {
    private List<Student> list = new ArrayList<Student> ();
    public StudentList () {
    }
    public void add (Student student) {
        list.add(student);
    }
    public Student get (int index) {
        return list.get(index);
    }
    public Student remove (int index) {
        return list.remove(index);
    }
    public int size () {
        return list.size();
    }
}
