package LabWork2.Animal;

public class Anm {
    String food;
    String location;

    public Anm(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("Noise");
    }

    public void eat() {
        System.out.println("Eat");
    }

    public void sleep() {
        System.out.println("Sleep");
    }
}
