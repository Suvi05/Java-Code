package Lectures.Constructors;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Suvi", "Earth");

        System.out.println("Constructor's Value - " + student.name);
        student.name = "Sumit";
        System.out.println("Re-initialized Value - " + student.name);

        Student studentcopy = new Student(student);
        System.out.println("Copy Constructor's Name : " + studentcopy.name);
        System.out.println("Copy Constructor's Address : " + studentcopy.address);
    }
}
