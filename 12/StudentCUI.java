import java.util.List;
import java.util.Arrays;

public class StudentCUI {
    public static void main(String[] args) {
        EducateeList educateeList = RecordDB.getEducateeList();
        EducateeListManager eManager = new EducateeListManager(educateeList);

        //

        String keyId = UI.inputString("�w�Дԍ���");
        Educatee educatee = eManager.searchEducateeById(keyId);
        List<String> list = Arrays.asList("�S�Ȗ�", "�Ȗږ��ꗗ");
        int a = UI.selectList(list, "�ԍ��őI����");
        
        switch (a) {
            case 0:
                //�S�Ȗ�
                RecordUtils.print(educatee);
                break;
        
            case 1:
                //�Ȗږ��ꗗ
                list = eManager.searchSubjectNameById(keyId);
                a = UI.selectList(list, "�ԍ��őI����");
                RecordUtils.print(eManager.searchSubjectById(keyId, list.get(a)));
                break;
            default:
                break;
        }
    }
}
