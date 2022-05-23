package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Animal[] aninmal = {new Cat("fish","house","cat"),new Dog("bread","house","dog"),new Horse("carrot","jailo","horse")};

        Veterinarian veterinarian = new Veterinarian();
        for (Animal a: aninmal){
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            veterinarian.treatAnimal(a);
            a.eat();
            a.sleep();
            a.makeNoise();

        }



    }
}
