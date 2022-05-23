package com.company;

public class Horse extends Animal{
    private String horseName;

    public Horse(String food, String location, String horseName) {
        super(food, location);
        this.horseName = horseName;
    }

    public String getHorseName() {
        return horseName;
    }

    public void setHorseName(String horseName) {
        this.horseName = horseName;
    }

    @Override
    public void makeNoise() {
        System.out.println("igogo");
    }

    @Override
    public void eat() {
        System.out.println(horseName+ " likes eat a "+ getFood());
    }

    @Override
    public void sleep() {
        System.out.println(horseName+ " is sleeping.");
    }

    @Override
    public String toString() {
        return "Horse{" +
                "horseName='" + horseName + '\'' +
                "} " + super.toString();
    }
}
