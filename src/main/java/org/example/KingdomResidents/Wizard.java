package org.example.KingdomResidents;

public class Wizard extends Residents{

    protected String spell;

    public Wizard(String name, Integer age, String residence) {
        super(name, age, residence);
    }

    @Override
    public String speak() {
        return "Wizards can speak too!";
    }

    public String learnSpell(){
        return name +" who is a wizard learns the spell: "+ spell;
    }

    public String castSpell(){
        return name +" who is a wizard casts the spell: "+ spell;
    }

    @Override
    public String dailyRoutine() {
        return name + "who is a wizard of " + age + " years of age spends the day learning new spells and casting them!";

    }
}
