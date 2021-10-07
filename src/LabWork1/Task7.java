package LabWork1;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите код города: ");
        int a = in.nextInt();
        if (a == 905) {
            System.out.println("г.Москва. Стоимость разговора: 41.5");
        } else if (a == 194) {
            System.out.println("г.Ростов. Стоимость разговора: 19.8");
        } else if (a == 491) {
            System.out.println("г.Краснодар. Стоимость разговора: 26.9");
        } else if (a == 800) {
            System.out.println("г.Киров. Стоимость разговора: 50");
        } else {
            System.out.println("Неверный формат кода города");
        }
    }
}