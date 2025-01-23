package org.example.day8.ques5;

public class Main {
    public static void main(String[] args){
        Restaurant r1 = new FastFoodRestaurant("McDonalds");
        r1.addFoodItem("Butter Paneer");
        r1.addFoodItem("Cheeseburger");
        r1.removeFoodItem("Butter Paneer");

        Restaurant r2 = new FastFoodRestaurant("Chipotle", "Mexican");
        r2.addFoodItem("Tacos");
        r2.addFoodItem("Pad Thai");
        r2.addFoodItem("Burrito");
        r2.addFoodItem("Burrito"); // Duplicate, no effect
        r2.removeFoodItem("Pad Thai");


        System.out.println(r1.getName());
        System.out.println(r1.getCuisine());
        r1.removeFoodItem("Butter Paneer");
        System.out.println(r1.getMenu());
        System.out.println(r1.getNumFoodItems());
        System.out.println(r2.getName());
        System.out.println(r2.getCuisine());
        System.out.println(r2.getMenu());
        System.out.println(r2.getNumFoodItems());
        System.out.println(r1.hasMoreOptions(r2));




    }
}
