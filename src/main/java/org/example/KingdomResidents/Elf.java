package org.example.KingdomResidents;

public class Elf extends Residents{

    public Elf(String name, Integer age, String residence) {
        super(name, age, residence);
    }

    @Override
    public String speak() {
        return "Elves can speak!";
    }

    public String skills() {
        return name + " who is an elf has exceptional agility and archery skills!";
    }

    public String craftMagicItem() {
        return name + " who is an elf crafts magical items!";
    }

    public String enhancedVision() {
        return name+ " who is elf has enhanced vision";
    }

    @Override
    public String dailyRoutine() {
        return name + " an elf in "+ residence + "of " + age + " years of age spends the day practicing archery, crafting magical items!";
    }
}
