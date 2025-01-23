package org.example.KingdomResidents;

public class Dwarf extends Residents {
    public Dwarf(String name, int age, String location) {
        super(name, age, location);
    }

    @Override
    public String speak() {
        return "Dwarfs can also speak!";
    }

    public String mine() {
        return name + " who is a dwarf mines gems from the land!";
    }

    public String forge() {
        return name + " who is a dwarf forges weapons!";
    }

    @Override
    public String dailyRoutine() {
        return name + "who is a dwarf of " + age + " years of age spends the day mining gems from the land, forging weapons!";
    }
}