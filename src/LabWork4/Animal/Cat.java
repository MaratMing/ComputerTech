package LabWork4.Animal;

public class Cat extends Animal {
    private String color;
    public Cat(boolean vegetarian, String eats, int noOflegs, String color) {
        super(vegetarian, eats, noOflegs);
        this.color = color;
    }
}