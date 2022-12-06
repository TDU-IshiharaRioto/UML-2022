import java.util.List;
import java.util.Arrays;

public class StudentCUI {
    public static void main(String[] args) {
        EducateeList educateeList = RecordDB.getEducateeList();
        EducateeListManager eManager = new EducateeListManager(educateeList);

        //

        String keyId = UI.inputString("学籍番号＞");
        Educatee educatee = eManager.searchEducateeById(keyId);
        List<String> list = Arrays.asList("全科目", "科目名一覧");
        int a = UI.selectList(list, "番号で選択＞");
        
        switch (a) {
            case 0:
                //全科目
                RecordUtils.print(educatee);
                break;
        
            case 1:
                //科目名一覧
                list = eManager.searchSubjectNameById(keyId);
                a = UI.selectList(list, "番号で選択＞");
                RecordUtils.print(eManager.searchSubjectById(keyId, list.get(a)));
                break;
            default:
                break;
        }
    }
}
