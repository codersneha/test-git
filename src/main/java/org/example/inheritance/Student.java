package org.example.inheritance;

public class Student extends Person{

    protected Integer studentId;
    protected Integer avgMarks;

    public Student(String name, Integer age, Integer StudentId, Integer avgMarks) {
        super(name, age);
    }

    @Override
    public String getDetails(){
        return super.getDetails()+ " having StudentId "+ this.studentId;

    }

    public String getAvgMarks(){
        return "Student" + this.name +" has an average marks of :- "+ this.avgMarks;
    }
}
