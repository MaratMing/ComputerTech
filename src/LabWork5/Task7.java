package LabWork5;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args){
        System.out.println("Введите последовательность симвовлов: ");
        Scanner console = new Scanner (System.in);
        String s = console.next();
        System.out.print("Введите строку: ");
        String t = console.next();
        System.out.println(s.equals(t));
    }
}
