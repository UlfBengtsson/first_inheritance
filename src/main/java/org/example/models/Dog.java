package org.example.models;

public class Dog extends Animal implements IDangerous {

    @Override
    public void eat() {
        System.out.println( getName() + " chews on a bone");
    }

    @Override
    public String howDangerous() {
        return "7: Bites can kill";
    }
}
