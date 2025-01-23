package org.example.inheritance;

public class Main {
    public static void main(String[] args) {
        Person Person = new Person("A", 32);
        System.out.println(Person.getDetails());

        Person Student1 = new Student("B", 16, 101, 80);
        System.out.println(Student1.getDetails());
       // System.out.println(Student1.getAvgMarks());

        Person Teacher = new Teacher("C", 38, "Physics");
        System.out.println(Teacher.getDetails());

        Person Primary = new Primary("D", 28,"Science");
        System.out.println(Primary.getDetails());

        Person Secondary = new Secondary("E", 30,"Maths");
        System.out.println(Primary.getDetails());
    }
}
