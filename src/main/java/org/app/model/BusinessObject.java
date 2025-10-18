package org.app.model;

public class BusinessObject {
    protected int id;
    protected String name;
    private static int counter = 1;

    public BusinessObject(String name) {
        this.id = counter++;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
