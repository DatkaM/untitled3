package com.company;

public class Animal {
    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void makeNoise(){
        System.out.println("The animals started making noise.");
    }

    public void eat(){
        System.out.println("Animal eat a "+ food);
    }
    public void sleep(){
        System.out.println("Animal is sleeping. ");
    }


}
