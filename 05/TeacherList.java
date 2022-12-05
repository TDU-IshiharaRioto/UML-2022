import java.util.ArrayList;
import java.util.List;

public class TeacherList {
    private List<Teacher> list = new ArrayList<Teacher>();
    public TeacherList () {

    }
    public void add (Teacher teacher) {
        this.list.add (teacher);
    }
    public Teacher get (int index) {
        return this.list.get (index);
    }
    public Teacher remove (int index) {
        return this.list.remove (index);
    }
    public int size () {
        return this.list.size();
    }
}
