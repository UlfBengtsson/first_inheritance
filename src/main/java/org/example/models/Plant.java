package org.example.models;

public class Plant implements IDangerous{
    private String name;
    private String rootType;
    private int poiseLevel;

    public Plant(String name) {
        this.name = name;
        poiseLevel = 0;
    }

    @Override
    public String howDangerous() {
        return poiseLevel + ": poises";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRootType() {
        return rootType;
    }

    public void setRootType(String rootType) {
        this.rootType = rootType;
    }

    public int getPoiseLevel() {
        return poiseLevel;
    }

    public void setPoiseLevel(int poiseLevel) {
        this.poiseLevel = poiseLevel;
    }
}
