import java.util.Arrays;
import java.util.Scanner;


public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = 1;
        int y = 2;
        int z = 3;
        System.out.println("Введите кол-во элементов массива");
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Введите элемент " + (i+1));
            nums[i] = scan.nextInt();
            if (nums[i] == x) {
                System.out.println("Вы ввели константу");
                continue;
            } else if (nums[i] == y) {
                System.out.println("Вы ввели константу");
                continue;
            }
            else if (nums[i] == z) {
                System.out.println("Вы ввели константу");
                continue;
            }
        }
    }
}