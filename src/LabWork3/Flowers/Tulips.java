package LabWork3.Flowers;

public class Tulips extends Flower {

    public Tulips(int price) {
        super(price);
    }

    @Override
    public int getPrice() {
        return price * 15;
    }
}