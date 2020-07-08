package org.example;

import com.sun.xml.internal.bind.v2.model.core.ID;
import org.example.models.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Animal animal = new Animal();//abstract class can´t create a object of its one.

        Dog dog = new Dog();
        dog.setName("Buster");
        //dog.eat();

        Animal polyDog = new Dog();
        polyDog.setName("Kain");
        //polyDog.eat();

        Animal polyCat = new Cat();
        polyCat.setName("Findus");
        //polyCat.eat();

        Cat cat = new Cat();
        cat.setPurring(true);
        cat.setName("Trollet");

        Animal[] animals = new Animal[] { polyCat, polyDog, dog, cat };

        for (Animal animal : animals) {
            animal.eat();
        }

        Plant plant = new Plant("Poieness Ivy");
        plant.setPoiseLevel(10);

        IDangerous[] canBeBadForHumans = new IDangerous[] { dog, plant };

        for ( IDangerous danger : canBeBadForHumans ) {
            System.out.println(danger.howDangerous());
        }
    }
}
