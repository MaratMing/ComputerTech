package LabWork1;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = in.nextInt();
        System.out.print("Введите число b: ");
        int b = in.nextInt();
        System.out.print("Введите число c: ");
        int c = in.nextInt();
        int d = Math.min(a, b);

        System.out.println("Наименьшее из чисел: " + Math.min(c, d));
    }
}