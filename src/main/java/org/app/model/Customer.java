package org.app.model;

import org.app.model.cake.Cake;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

public class Customer extends BusinessObject {

    private final List<Cake> history;

    public Customer(String name) {
        super(name);
        this.history = new ArrayList<>();
    }

    public void addOrder(Cake cake) {
        history.add(cake);
    }

    public void showCakeHistory() {
        System.out.println("\n--- Order History : " + name + " ---");
        for (Cake cake : history) {
            System.out.println("  - " + cake.name + " (" + cake.getType() + ")");
        }
        System.out.println();
    }
}
