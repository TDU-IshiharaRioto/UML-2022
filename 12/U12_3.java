import java.util.Arrays;
import java.util.List;

public class U12_3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("�S�Ȗ�", "�Ȗږ��ꗗ");
        int a = UI.selectList(list, "�ԍ��őI����");
        System.out.println(list.get(a) + "��I�����܂���");
    }
}
