import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class UI {
    public static String inputString (String message) {
        System.out.print (message);
        Scanner scanner = new Scanner (System.in);
        return scanner.nextLine();
    }
    public static int inputInt (String message) {
        System.out.print (message);
        Scanner scanner = new Scanner (System.in);
        return scanner.nextInt();
    }
    public static void printList (List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println (i + ":" + list.get(i));
        }
    }
    public static int selectList (List<String> list, String message) {
        UI.printList(list);
        return UI.inputInt(message);
    }
}
