package LabWork3.Flowers;

public class Roses extends Flower {
    int price;

    public Roses(int price) {
        super(price);
    }

    @Override
    public int getPrice() {
        return price * 20;
    }
}