package com.netcracker.autowiring.byName;

public class BookOwner {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BookOwner{" +
                "name='" + name + '\'' +
                '}';
    }
}
