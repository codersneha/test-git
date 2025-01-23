package org.example.day2;

public class Car {

    private static int carCount =0;

    private int car_id;
    private String brand_name;
    private String color;

    public int getCar_id() {
        return car_id;
    }


    public String getBrand_name() {
        return brand_name;
    }

    public String getColor() {
        return color;
    }

    public Car( String brand_name, String color){
        this.car_id= carCount;
        this.brand_name=brand_name;
        this.color=color;
        carCount++;
    }

    public static int getCarCount() {
        return carCount;
    }

    @Override
    public String toString() {
        return "Car(id = " + car_id + ", brandName ="  + brand_name + ", color = " + color + ")";
    }
}
