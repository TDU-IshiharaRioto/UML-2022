import java.util.Arrays;
import java.util.List;

public class U12_K1 {
    public static void main(String[] args) {
        EducateeList educateeList = RecordDB.getEducateeList();
        EducateeListManager eManager = new EducateeListManager(educateeList);

        //

        String keyId = UI.inputString("学籍番号＞");
        Educatee educatee = eManager.searchEducateeById(keyId);

        if (educatee == null) {
            System.out.println("データがありません");
            return;
        }
        
        List<String> list = Arrays.asList("全科目", "科目名一覧");
        int a = UI.selectList(list, "番号で選択＞");

        if (a != 0 && a != 1) {
            System.out.println("番号が間違っています");
            return;
        }

        switch (a) {
            case 0:
                //全科目
                RecordUtils.print(educatee);
                break;
        
            case 1:
                //科目名一覧
                List<String> SubjectNameList = eManager.searchSubjectNameById(keyId);
                int subjectSelect = UI.selectList(SubjectNameList, "番号で選択＞");

                if (subjectSelect < 0 || subjectSelect >= SubjectNameList.size()) {
                    System.out.println ("番号が間違っています");
                    return;
                }

                RecordUtils.print(eManager.searchSubjectById(keyId, SubjectNameList.get(subjectSelect)));
                break;
            default:
                break;
        }
    }
}
