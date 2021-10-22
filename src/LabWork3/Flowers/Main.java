package LabWork3.Flowers;

public class Main {
    public static int sumprice(Flower[] f){
        int x =0;
        int res = 0;
        while (x < f.length)
            res = f[x++].getPrice();
        return res;
    }
    public static void main(String[] msi) {
        int price = 100;

        Flower roses = new Roses(price);
        Flower tulips = new Tulips(price);
        Flower carnations = new Carnations(price);
        Flower cactus = new Cactus(price);
        Flower[] bouquet1 = { roses, tulips, carnations, cactus };
        Flower[] bouquet2 = { tulips, carnations, carnations };
        Flower[] bouquet3 = { roses, cactus, roses };
        System.out.print("Количество проданных цветов: ");
        System.out.println(bouquet1.length + bouquet2.length + bouquet3.length);
        System.out.println("Цена проданных букетов: " + (sumprice(bouquet1) + sumprice(bouquet2) + sumprice(bouquet3)));
    }


}
