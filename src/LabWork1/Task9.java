package LabWork1;
public class Task9 {
    public static void main(String[] args){

        int a[] = { 15,10,51,6,5,3,10,-34,0,32,56,12,24,52};

        int n = a.length; //Переменная для обмена элементов
        int temp;

        for (int i = 0; i < n/2; i++) {
            temp = a[n-i-1];
            a[n-i-1] = a[i];
            a[i] = temp;
        }
        for (int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}