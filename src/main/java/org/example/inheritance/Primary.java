package org.example.inheritance;

public class Primary extends Teacher {

    public Primary(String name, Integer age, String subject) {
        super(name, age, subject);
    }

    @Override
    public String getDetails() {
        return super.getDetails() + " teaching " + this.subject + " in primary classes.";
    }
}