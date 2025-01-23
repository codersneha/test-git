package org.example.KingdomResidents;

public abstract class Residents {

    protected String name;
    protected Integer age;

    public Residents(String name, Integer age, String residence) {
        this.name = name;
        this.age = age;
        this.residence = residence;
    }

    protected String residence;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public abstract String speak();

    public void trade() {
        System.out.println(name + "can trade!");
    }

    public abstract String dailyRoutine();
}
