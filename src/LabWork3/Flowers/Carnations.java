package LabWork3.Flowers;

public class Carnations extends Flower {

    public Carnations(int price) {
        super(price);
    }

    @Override
    public int getPrice() {
        return price * 10;
    }
}