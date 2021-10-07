package LabWork2.Stud;

public class Main {
    public static void main(String[] msi) {
        Student student = new Student("Borow", "Maksimenko", "BAP1801", 4.7);
        Aspirant aspirant = new Aspirant("Vasyan", "Usachev", "ISUA", 5, "SmartHouse");
        Student un = new Aspirant("Podpal", "Danilyi", "BAP1801", 4.5, "ComputerVision");
        Student[] students = { student, aspirant, un };

        for (Student s : students)
            System.out.println(s.getScholarship());
    }
}