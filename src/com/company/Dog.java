package com.company;

public class Dog extends Animal{
    private String dogName;

    public Dog(String food, String location, String dogName) {
        super(food, location);
        this.dogName = dogName;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    @Override
    public void makeNoise() {
        System.out.println("gav-gav");
    }

    @Override
    public void eat() {
        System.out.println(dogName+" likes eat a " + getFood());
    }

    @Override
    public void sleep() {
        System.out.println(dogName+" is sleeping.");

    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                "} " + super.toString();
    }
}
