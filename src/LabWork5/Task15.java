package LabWork5;
import java.util.Scanner;
public class Task15 {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner console = new Scanner (System.in);
        String word = console.next();
        for (int i = 0; i < word.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < word.length(); j++) {
                if (i != j && word.charAt(i) == word.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                System.out.println("Первый неповторяющийся символ: " + word.charAt(i));
                break;
            }
        }
    }
}
