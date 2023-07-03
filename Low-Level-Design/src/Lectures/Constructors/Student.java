package Lectures.Constructors;

public class Student {
    String name;
    String address;

    Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    Student(Student other) { //Copy Constructor
        name = other.name;
        this.address = other.address;
    }
}
