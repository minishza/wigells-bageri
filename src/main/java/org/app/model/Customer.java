package org.app.model;

import org.app.model.cake.Cake;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

public class Customer extends BusinessObject {

    private final List<Cake> history;
    private final PropertyChangeSupport pcs;

    public Customer(String name) {
        super(name);
        this.history = new ArrayList<>();
        this.pcs = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        pcs.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        pcs.removePropertyChangeListener(listener);
    }

    public void fireOrderEvent(CakeType cakeType) {
        pcs.firePropertyChange("order", null, cakeType);
    }

    public void fireCakeReadyEvent(CakeType cakeType) {
        pcs.firePropertyChange("cake is ready", null, cakeType);
    }

    public void addOrder(Cake cake) {
        history.add(cake);
        pcs.firePropertyChange("order", null, cake.getType());
    }

    public void showCakeHistory() {
        System.out.println("\n--- Order History : " + name + " ---");
        for (Cake cake : history) {
            System.out.println("  - " + cake.name + " (" + cake.getType() + ")");
        }
        System.out.println();
    }
}
