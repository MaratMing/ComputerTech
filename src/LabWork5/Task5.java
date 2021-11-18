package LabWork5;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args){
        System.out.print("Введите строки: ");
        Scanner console = new Scanner (System.in);
        String s = console.next();
        String t = console.next();
        int n = s.compareToIgnoreCase(t);
        if (n==0) {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}