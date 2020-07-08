package org.example.models;

public abstract class Animal {

    private String name;

    public abstract void eat();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
