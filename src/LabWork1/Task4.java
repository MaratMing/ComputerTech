package LabWork1;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = in.nextInt();
        if (a>0) {
            System.out.println("Ответ: " + (a + 1));
        } else if (a<0){
            System.out.println("Ответ: " + (a - 2));
        } else {
            a=10;
            System.out.println("Ответ: " + a);
        }
    }
}