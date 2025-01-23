package org.example.day8.ques5;

/*
 Consider the following interface Restaurant. For this problem, you are to write a class called FastFoodRestaurant, which implements the Restaurant. The FastFoodRestaurant class should have two constructors. The first constructor should take a String name and the associated cuisine would be “N/A”. The second constructor should take two parameters (String name and String cuisine).
public interface Restaurant {
// Returns the name of the Restaurant public String getName();
// Returns the cuisine of the Restaurant (For example: Thai or Indian) public String getCuisine();
// Returns a list of items on the menu. public List<String> getMenu();
// Adds a food item to the menu. If the food item is already present, then there is no // change.
public void addFoodItem(String foodName);
// Removes a food item from the menu.
// Throws an IllegalArgumentException if the food item does not exist. public void removeFoodItem(String foodName);
// Returns the number of food items on the menu. public int getNumFoodItems();
// Makes a reservation at the particular restaurant. If a restaurant doesn’t take
// reservations (ex. Fast Food restaurants), then it returns “No reservation needed!”. // If a restaurant accepts reservations, it returns “Success” or “Failure”.
public String makeReservation(String time);
// Returns true if this restaurant has more items than the other restaurant // otherwise false.
public boolean hasMoreOptions(Restaurant other);
}
For example, if the following lines were executed using the FastFoodRestaurant class... Restaurant r1 = new FastFoodRestaurant(“McDonalds”);
r1.addFoodItem(“Butter Paneer”);
r1.addFoodItem(“Cheeseburger”);
r1.removeFoodItem(“Butter Paneer”);
Restaurant r2 = new FastFoodRestaurant(“Chipotle”, “Mexican”); r2.addFoodItem(“Tacos”);
r2.addFoodItem(“PadThai”);
r2.addFoodItem(“Burrito”);
r2.addFoodItem(“Burrito”);
r2.removeFoodItem(“PadThai”);
Then, the following methods would return...
r1.getName()
r1.getCuisine()
r1.getMenu() r1.getNumFoodItems() r2.getName()
r2.getCuisine()
r2.getMenu() r2.getNumFoodItems() r1.hasMoreOptions(r2) r1.makeReservation(“8:00pm”)
// McDonalds
// N/A
// [Cheeseburger]
//1
// Chipotle
// Mexican
// [Tacos, Burrito] -> order does not matter //2
// false
//Noreservationneeded!
 */

import java.util.List;

public interface Restaurant {
    public String getName();
    public String getCuisine();
    public List<String> getMenu();
    public void addFoodItem(String foodName);
    public void removeFoodItem(String foodName);
    public int getNumFoodItems();
    public String makeReservation(String time);
    public boolean hasMoreOptions(Restaurant other);
}
