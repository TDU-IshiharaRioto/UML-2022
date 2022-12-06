import java.util.ArrayList;
import java.util.List;

public class EducateeListManager {
    private EducateeList educateeList;

    public EducateeListManager (EducateeList educateeList) {
        this.educateeList = educateeList;
    }

    public Educatee searchEducateeById (String keyId) {
        for (int i = 0; i < this.educateeList.size(); i++) {
            if (educateeList.get(i).getId().equals(keyId)) {
                return educateeList.get(i);
            }
        }
        return null;
    }

    public List<String> searchSubjectNameById (String keyId) {
        List<String> list = new ArrayList<String>();
        Educatee educatee = searchEducateeById(keyId);
        for (int i = 0; i < educatee.size(); i++) {
            list.add(educatee.get(i).getName());
        }
        return list;
    }

    public Subject searchSubjectById (String keyId, String keySubjectName) {
        Educatee educatee = searchEducateeById(keyId);
        for (int i = 0; i < educatee.size(); i++) {
            if (educatee.get(i).getName().equals(keySubjectName)) {
                return educatee.get(i);
            }
        }
        return null;
    }
}
