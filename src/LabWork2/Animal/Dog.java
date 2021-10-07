package LabWork2.Animal;

public class Dog extends Anm {
    String name;
    public Dog(String name, String food, String location) {
        super(food, location);
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println("Woof");
    }

    @Override
    public void eat() {
        System.out.println("Dog eat");
    }
}