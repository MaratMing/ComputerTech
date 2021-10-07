package LabWork2.Animal;

public class Main {
    public static void main(String[] msi) {
        Vet vet = new Vet();
        Anm[] animals = new Anm[3];
        animals[0] = new Dog("Клеппа", "Чаппи", "Дача");
        animals[1] = new Cat("Бувсич", "Китикет", "Квартира");
        animals[2] = new Horse("Жаклин", "Овёс", "Конюшня");

        for (Anm animal : animals) {
            vet.treatAnimal(animal);
        }
    }
}