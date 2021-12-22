import java.util.Scanner;
import java.lang.Math;


public class Task11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число:");
        String num1 = scan.next();
        System.out.println("Введите второе число:");
        double num2 = scan.nextDouble();
        int res2 = (int) num2;
        int val = Integer.parseInt(num1);
        if (val > res2) {
            System.out.println("Наибольшее число: " + val);
            System.out.println("Наименьшее число: " + num2);
        }else{
                System.out.println("Наибольшее число: " + num2);
            System.out.println("Наименьшее число: " + (double)val);
            }
        }
    }
