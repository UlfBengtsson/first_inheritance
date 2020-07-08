package org.example.models;

public class Cat extends Animal {

    private boolean purring;

    @Override
    public void eat() {
        System.out.println( getName() + " feasts on a fish");
    }

    public boolean isPurring() {
        return purring;
    }

    public void setPurring(boolean purring) {
        this.purring = purring;
    }
}
