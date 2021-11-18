package LabWork5;
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args){
        System.out.print("Введите первую строку: ");
        Scanner console = new Scanner (System.in);
        String t = console.next();
        System.out.print("Введите вторую строку: ");
        String s = console.next();
        String last = "";
        for ( int i = t.length() - 1;i>=t.length()-s.length() ; i-- ) {
            last = t.charAt(i)+last ;
        }
        System.out.println(s.equals(last));
    }

}
