package LabWork5;
import java.util.Scanner;
public class Task16 {
    public static void main(String[] args){
        System.out.print("Введите строку: ");
        Scanner console = new Scanner (System.in);
        String n = console.next();
        Frack(n);
    }

    public static void Frack(String n){
        String back = "";
        String front = "";
        front = front + n.charAt(0)+n.charAt(1);
        int i = n.length()-1;
        back = back + n.charAt(i-1)+n.charAt(i);
        if (front.equals(back))
            System.out.println(true);
        else
            System.out.println(false);
    }
}
