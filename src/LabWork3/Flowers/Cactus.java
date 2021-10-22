package LabWork3.Flowers;

public class Cactus extends Flower {

    public Cactus(int price) {
        super(price);
    }

    @Override
    public int getPrice() {
        return price * 25;
    }
}

