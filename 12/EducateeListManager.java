import java.util.ArrayList;
import java.util.List;

public class EducateeListManager {
    private EducateeList educateeList;

    /**
     * �R���X�g���N�^�B
     * @param educateeList �w�K�҃��X�g
     */
    public EducateeListManager (EducateeList educateeList) {
        this.educateeList = educateeList;
    }

    /**
     * �����Ŏw�肳�ꂽ�w�Дԍ��Ɉ�v����Educatee�I�u�W�F�N�g��Ԃ�
     * @param keyId �w�Дԍ�
     * @return ��v����{@link Educatee#Educatee()}�I�u�W�F�N�g�B��v���Ȃ����null
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
     * �����Ŏw�肳�ꂽ�w�Дԍ��Ɉ�v����w�K�҂̉Ȗږ��̃��X�g��Ԃ�
     * @param keyId �w�Дԍ�
     * @return ��v����{@link Educatee#Educatee()}�������Ă���{@link Subject#Subject(String)}�I�u�W�F�N�g��{@link Subject#getName()}�̒l�̈ꗗ
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
     * �����Ŏw�肳�ꂽ�Ȗڂ�Ԃ��܂��B
     * @param keyId �w�Дԍ�
     * @param keySubjectName �Ȗږ�
     * @return ��v����ꍇ�́A{@link Subject#Subject(String)}�I�u�W�F�N�g�B��v���Ȃ��ꍇ��null
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
