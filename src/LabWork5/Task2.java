package LabWork5;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        System.out.print("Введите строку: ");
        Scanner console = new Scanner (System.in);
        String n = console.next();
        DelDouble(n);
    }
    public static void DelDouble(String n){
        ArrayList<Character> set=new ArrayList<Character>();
        char[] str=n.toCharArray();
        for(int i=0;i<str.length;i++)
        {
            if(!set.contains(str[i])){
                set.add(str[i]);
            }
        }
        for(char t:set)
        {
            System.out.print(t);
        }
    }
}