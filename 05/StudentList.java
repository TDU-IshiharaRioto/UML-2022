import java.util.ArrayList;
import java.util.List;

public class StudentList {
    private List<Student> list = new ArrayList<Student> ();
    public StudentList () {

    }
    public void add (Student student) {
        this.list.add (student);
    }
    public Student get (int index) {
        return this.list.get (index);
    }
    public Student remove (int index) {
        return this.list.remove (index);
    }
    public int size () {
        return this.list.size();
    }
}
