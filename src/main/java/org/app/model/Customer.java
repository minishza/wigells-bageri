package org.app.model;

import org.app.model.cake.Cake;
import org.app.observer.Observer;
import org.app.observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class Customer extends BusinessObject implements Subject {
    public List<Observer> observers;
    public List<Cake> history;

    public Customer(String name) {
        super(name);
        this.observers = new ArrayList<>();
        this.history = new ArrayList<>();
    }

    public void addOrder(Cake cake) {
        history.add(cake);
        notifyObservers("ORDER", cake.getType());
    }

    public void showCakeHistory() {
        System.out.println("\n--- Order History : " + name + " ---");
        for (Cake cake : history) {
            System.out.println("  - " + cake.name + " (" + cake.getType() + ")");
        }
        System.out.println();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String message, CakeType cakeType) {
        for (Observer o : observers) {
            o.update(message, cakeType.name());
        }
    }
}
