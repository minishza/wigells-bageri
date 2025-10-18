package org.app.system;

import org.app.builder.CakeBuilder;
import org.app.builder.ChocolateCakeBuilder;
import org.app.builder.OperaCakeBuilder;
import org.app.builder.PrincessCakeBuilder;
import org.app.command.ChocolateDecorationCommand;
import org.app.command.Command;
import org.app.command.OperaDecorationCommand;
import org.app.command.PrincessDecorationCommand;
import org.app.model.CakeType;
import org.app.model.Customer;
import org.app.model.cake.Cake;
import org.app.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class OrderHandler {
    private List<Observer> observers;

    public OrderHandler() {
        this.observers = new ArrayList<>();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notify(String event, String cakeName) {
        for (Observer observer : observers) {
            observer.update(event, cakeName);
        }
    }

    public void orderCake(Customer customer, CakeType cakeType) {
        System.out.println("\n++++++ NEW CAKE ++++++");
        System.out.println("Customer: " + customer.getName());
        System.out.println("Typ: " + cakeType);

        notify("BESTÄLLD: " + customer.getName() + " cake : " + cakeType, cakeType.name());

        CakeBuilder builder;
        Cake cake;
        Command command;

        builder = switch (cakeType) {
            case CakeType.PRINCESS_CAKE -> new PrincessCakeBuilder("Princess Cake");
            case CakeType.OPERA_CAKE -> new OperaCakeBuilder("Opera Cake");
            case CakeType.CHOCOLATE_CAKE -> new ChocolateCakeBuilder("Chocolate Cake");
        };

        System.out.println("\n--- Skapas ---");
        cake = builder.addFirstCakeBase()
                .applyCream()
                .addSecondCakeBase()
                .addAdditionalCream()
                .AddThirdCakeBase()
                .build();

        System.out.println("--- Dekoreras ---");
        if (cakeType == CakeType.PRINCESS_CAKE) {
            command = new PrincessDecorationCommand(cake);
        } else if (cakeType == CakeType.OPERA_CAKE) {
            command = new OperaDecorationCommand(cake);
        } else {
            command = new ChocolateDecorationCommand(cake);
        }

        command.execute();

        System.out.println();
        notify("KLART: " + cakeType + " gjort för " + customer.getName(), cake.getName());

        customer.addOrder(cake);
    }
}