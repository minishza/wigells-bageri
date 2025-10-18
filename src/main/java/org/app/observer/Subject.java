package org.app.observer;

import org.app.model.CakeType;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(String message, CakeType cakeType);
}