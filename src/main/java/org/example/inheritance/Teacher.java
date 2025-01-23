package org.example.inheritance;

public class Teacher extends Person{

    protected String subject;

    public Teacher(String name, Integer age, String subject) {
        super(name, age);
    }

    @Override
    public String getDetails(){
        return super.getDetails()+ " teaching "+ this.subject;

    }
}
