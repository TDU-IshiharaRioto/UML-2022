import java.util.Arrays;
import java.util.List;

public class U12_3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("全科目", "科目名一覧");
        int a = UI.selectList(list, "番号で選択＞");
        System.out.println(list.get(a) + "を選択しました");
    }
}
