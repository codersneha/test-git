package org.example.day8.ques5;

import java.util.ArrayList;
import java.util.List;

public class FastFoodRestaurant implements Restaurant {

    private String Name;
    private String Cuisine;
    private List<String> Menu;

    public FastFoodRestaurant(String Name) {
        this.Name= Name;
        this.Cuisine ="N/A";
        this.Menu= new ArrayList<>();
    }

    public FastFoodRestaurant(String Name, String Cuisine) {
        this.Name= Name;
        this.Cuisine =Cuisine;
        this.Menu= new ArrayList<>();
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public String getCuisine() {
        return Cuisine;
    }

    @Override
    public List<String> getMenu() {
        return Menu;
    }

    @Override
    public void addFoodItem(String foodName) {
        if (!Menu.contains(foodName)) {
            Menu.add(foodName);
            System.out.println(foodName + " is added to the menu!");
        }
    }

    @Override
    public void removeFoodItem(String foodName) {
        if (!Menu.contains(foodName)) {
            System.out.println("The food does not exist in menu!");
        } else {
            Menu.remove(foodName);
            System.out.println(foodName + " is removed from the menu!");
        }
    }

    @Override
    public int getNumFoodItems() {
        return Menu.size();
    }

    @Override
    public String makeReservation(String time) {
        return "No reservation needed!";
    }

    @Override
    public boolean hasMoreOptions(Restaurant other) {
        return this.getNumFoodItems() > other.getNumFoodItems();
    }
}