import java.util.List;

public class U12_4 {
    public static void main(String[] args) {
        EducateeList educateeList = RecordDB.getEducateeList();
        EducateeListManager eManager = new EducateeListManager(educateeList);

        //

        String keyId = "s001";
        List<String> list = eManager.searchSubjectNameById(keyId);
        int i = UI.selectList(list, "�ԍ��őI����");
        System.out.println (list.get(i) + "��I�����܂���");
    }
}
