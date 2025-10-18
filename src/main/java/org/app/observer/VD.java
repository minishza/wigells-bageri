package org.app.observer;


import org.app.model.BusinessObject;

public class VD extends BusinessObject implements Observer {
    public VD(String namn) {
        super(namn);
    }

    @Override
    public void update(String message, String cakeName) {
        System.out.println("\n - MEDDELANDE TILL VD - ");
        System.out.println("Meddelande: " + message);
        System.out.println("Tårta: " + cakeName);
        System.out.println("--------------------------\n");
    }
}