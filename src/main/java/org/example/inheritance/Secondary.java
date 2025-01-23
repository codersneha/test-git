package org.example.inheritance;

public class Secondary extends Teacher {

    public Secondary(String name, Integer age, String subject) {
        super(name, age, subject);
    }

    @Override
    public String getDetails() {
        return super.getDetails() + " teaching " + this.subject + " in secondary classes.";
    }
}