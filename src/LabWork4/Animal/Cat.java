package LabWork4.Animal;

public class Cat extends Animal {
    private String color;
    public Cat(boolean vegatarian, String eats, int noOflegs, String color) {
        super(vegatarian, eats, noOflegs);
        this.color = color;
    }
}