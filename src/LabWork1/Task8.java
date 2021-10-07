package LabWork1;
public class Task8 {
    public static void main(String[] args) {
        int mas[] = {1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2};
        System.out.print("Массив: [ ");
        for (int i: mas){
            System.out.print(i + " ");
        }
        System.out.print(" ]");
        int max= 0;
        int a = 0; //Сумма положительных элементов
        int b = 0; //Сумма четных отрицательных элементов
        int c = 0; //Количество положительных элементов
        int d = 0; //Количество отрицательных элементов
        int e = 0; //Разность отрицательных элементов
        for (int elem : mas) {
            if (elem > max) {
                max=elem;
            }
            if (elem > 0){
                a+=elem;
                c+=1;
            }
            if (elem < 0){
                if( elem % 2 == 0){
                    b+=elem;
                }
                e+=1;
                d+=elem;
            }
        }
        System.out.println();
        System.out.println("Максимальное значение = " + max);
        System.out.println("Сумма положительных элемнтов = " + a);
        System.out.println("Сумма четных отрицательных элементов = " + b);
        System.out.println("Количество положительных элементов = " + c);
        System.out.println("Среднее арифметическое отрицательных элементов = " + (d/e));
    }
}