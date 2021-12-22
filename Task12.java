import java.util.Locale;
import java.util.Scanner;


public class Task12 {
    public static void main(String[] args) {
        System.out.println("Введите I like Java!!!");
        Scanner scan = new Scanner(System.in);
        String ilikejava = scan.nextLine();
        if (ilikejava.contains("Java")) {
            if (ilikejava.startsWith("I like")) {
                if (ilikejava.endsWith("!!!")) {
                    System.out.println(ilikejava.toUpperCase(Locale.ROOT));
                    System.out.println(ilikejava.substring(7, 11).replace('a', 'o'));
                }
            }
        }
    }
}
