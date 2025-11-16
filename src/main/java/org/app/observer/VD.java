package org.app.observer;


import org.app.model.BusinessObject;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class VD extends BusinessObject implements PropertyChangeListener {
    public VD(String namn) {
        super(namn);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("\n - MEDDELANDE TILL VD - ");
        System.out.println("Händelse: " + evt.getPropertyName());
        System.out.println("Tårta: " + evt.getNewValue());
        System.out.println("--------------------------\n");
    }
}