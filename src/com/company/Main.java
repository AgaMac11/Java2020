package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	Animal dog = new Animal();
	dog.species = "Husky";
	dog.name = "Haiko";
	dog.weight = 40.0;


	System.out.println(dog.name);
	System.out.println(dog.species);

	Phone S10 = new Phone();
	S10.producer = "Samsung";
            S10.model = "111";
            S10.screensize = 5.0;

        System.out.println(dog.weight);
        dog.feed(12.0);
        System.out.println(dog.weight);

        Human me = new Human();
        me.firstName = "Agata";
        me.lastName = "Maciesza";
        me.pet = dog;

        System.out.println(me.firstName);
        System.out.println(me.pet.species);

        dog.feed(10.0);
        System.out.println(dog.weight);






    }
}
