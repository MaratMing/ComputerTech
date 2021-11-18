package LabWork5;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args){
        System.out.print("Введите строку: ");
        Scanner console = new Scanner (System.in);
        String n = console.next();
        Palindrome(n);
    }
    public static void Palindrome(String n){
        String reverse = "";
        for ( int i = n.length() - 1; i >= 0; i-- ) {
            reverse = reverse + n.charAt(i);
        }
        if (n.equals(reverse))
            System.out.println("Введенная строка является палиндромом");
        else
            System.out.println("Введенная строка не является палиндромом");
    }
}