package org.example.KingdomResidents;

public class Main {
    public static void main(String[] args) {

        Residents Elf = new Elf("ABC", 95, "Elf forest");
        Residents Dwarf = new Dwarf("DEF", 120, "Dwarf Hills");
        Residents Wizard = new Wizard("PQR", 18, "Wizard tower");

        System.out.println(Elf.speak());
        System.out.println(Elf.dailyRoutine());
        System.out.println(Dwarf.dailyRoutine());
        System.out.println(Wizard.dailyRoutine());

    }

}
