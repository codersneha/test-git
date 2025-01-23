package org.example.day2;

public class Employee {

    private static int empCount =0;

    private String name;
    private int  empId;
    private int salary;
    private Car car;

    //int, Integer
    //primitive types can never be null
    //if you really want null then use Integer
    public Employee(String name, int salary, Car car){
        this.name = name;
        this.empId=empCount;
        this.salary=salary;
        this.car=car;
        empCount++;
    }

    public Employee(String name, int salary){
        this.name = name;
        this.empId=empCount;
        this.salary=salary;
        this.car=null;
    }

    /*

     A static method can only access static properties
     A sttaic method would be invoked by the class only, not by the object
     */

    public static int getEmpCount() {
        return empCount;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                ", salary=" + salary +
                ", car=" + (car == null ? "nei": car.toString()) +
                '}';
    }
//method overloading
    // when two or multiple method have same name & same return type
    // but has different arguments
        // different number of argument
        // or same number of arguments but argument data type is different

    public Car getCar() {
        return car;
    }

    public String getName() {
        return name;
    }

    public int getEmpId() {
        return empId;
    }

    public int getSalary() {
        return salary;
    }
}
