package LabWork1;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = in.nextInt();
        if (a == 0)
            System.out.println("Нулевое число");
        if (a > 0 && a % 2 == 0)
            System.out.println("Положительное четное число");
        if (a > 0 && a % 2 != 0)
            System.out.println("Положительное нечетное число");
        if (a < 0 && a % 2 == 0)
            System.out.println("Отрицательное четное число");
        if (a < 0 && a % 2 != 0)
            System.out.println("Отрицательное нечетное число");
    }
}