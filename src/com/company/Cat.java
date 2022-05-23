package com.company;

public class Cat extends Animal{
    private String catName;


    public Cat(String food, String location, String catName) {
        super(food, location);
        this.catName = catName;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    @Override
    public void makeNoise() {
        System.out.println("meow-meow");
    }

    @Override
    public void eat() {
        System.out.println(catName+ " likes eat a " + getFood());
    }

    @Override
    public void sleep() {
        System.out.println(catName+ " is sleeping.");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "catName='" + catName + '\'' +
                "} " + super.toString();
    }
}
