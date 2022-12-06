import java.util.ArrayList;
import java.util.List;

public class EducateeListManager {
    private EducateeList educateeList;

    /**
     * コンストラクタ。
     * @param educateeList 学習者リスト
     */
    public EducateeListManager (EducateeList educateeList) {
        this.educateeList = educateeList;
    }

    /**
     * 引数で指定された学籍番号に一致するEducateeオブジェクトを返す
     * @param keyId 学籍番号
     * @return 一致する{@link Educatee#Educatee()}オブジェクト。一致しなければnull
     */
    public Educatee searchEducateeById (String keyId) {
        for (int i = 0; i < this.educateeList.size(); i++) {
            if (educateeList.get(i).getId().equals(keyId)) {
                return educateeList.get(i);
            }
        }
        return null;
    }

    /**
     * 引数で指定された学籍番号に一致する学習者の科目名のリストを返す
     * @param keyId 学籍番号
     * @return 一致する{@link Educatee#Educatee()}が持っている{@link Subject#Subject(String)}オブジェクトの{@link Subject#getName()}の値の一覧
     */
    public List<String> searchSubjectNameById (String keyId) {
        List<String> list = new ArrayList<String>();
        Educatee educatee = searchEducateeById(keyId);
        for (int i = 0; i < educatee.size(); i++) {
            list.add(educatee.get(i).getName());
        }
        return list;
    }

    /**
     * 引数で指定された科目を返します。
     * @param keyId 学籍番号
     * @param keySubjectName 科目名
     * @return 一致する場合は、{@link Subject#Subject(String)}オブジェクト。一致しない場合はnull
     */
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
