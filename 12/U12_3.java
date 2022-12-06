import java.util.Arrays;
import java.util.List;

public class U12_3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("‘S‰È–Ú", "‰È–Ú–¼ˆê——");
        int a = UI.selectList(list, "”Ô†‚Å‘I‘ğ„");
        System.out.println(list.get(a) + "‚ğ‘I‘ğ‚µ‚Ü‚µ‚½");
    }
}
