package LabWork2.Animal;

public class Cat extends Anm {
    String name;
    public Cat(String name, String food, String location) {
        super(food, location);
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }

    @Override
    public void eat() {
        System.out.println("Cat eat");
    }
}