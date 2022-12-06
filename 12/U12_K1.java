import java.util.Arrays;
import java.util.List;

public class U12_K1 {
    public static void main(String[] args) {
        EducateeList educateeList = RecordDB.getEducateeList();
        EducateeListManager eManager = new EducateeListManager(educateeList);

        //

        String keyId = UI.inputString("�w�Дԍ���");
        Educatee educatee = eManager.searchEducateeById(keyId);

        if (educatee == null) {
            System.out.println("�f�[�^������܂���");
            return;
        }
        
        List<String> list = Arrays.asList("�S�Ȗ�", "�Ȗږ��ꗗ");
        int a = UI.selectList(list, "�ԍ��őI����");

        if (a != 0 && a != 1) {
            System.out.println("�ԍ����Ԉ���Ă��܂�");
            return;
        }

        switch (a) {
            case 0:
                //�S�Ȗ�
                RecordUtils.print(educatee);
                break;
        
            case 1:
                //�Ȗږ��ꗗ
                List<String> SubjectNameList = eManager.searchSubjectNameById(keyId);
                int subjectSelect = UI.selectList(SubjectNameList, "�ԍ��őI����");

                if (subjectSelect < 0 || subjectSelect >= SubjectNameList.size()) {
                    System.out.println ("�ԍ����Ԉ���Ă��܂�");
                    return;
                }

                RecordUtils.print(eManager.searchSubjectById(keyId, SubjectNameList.get(subjectSelect)));
                break;
            default:
                break;
        }
    }
}
