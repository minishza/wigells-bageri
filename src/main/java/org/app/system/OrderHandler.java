package org.app.system;

import org.app.builder.CakeBuilder;
import org.app.builder.ChocolateCakeBuilder;
import org.app.builder.OperaCakeBuilder;
import org.app.builder.PrincessCakeBuilder;
import org.app.command.*;
import org.app.model.CakeType;
import org.app.model.Customer;
import org.app.model.cake.*;

public class OrderHandler {

    public OrderHandler() {}

    public void orderCake(Customer customer, CakeType cakeType) {
        System.out.println("\n++++++ NEW CAKE ++++++");
        System.out.println("Customer: " + customer.getName());
        System.out.println("Typ: " + cakeType);

        customer.fireOrderEvent(cakeType);

        CakeBuilder builder = switch (cakeType) {
            case PRINCESS_CAKE -> new PrincessCakeBuilder("Princess Cake");
            case OPERA_CAKE -> new OperaCakeBuilder("Opera Cake");
            case CHOCOLATE_CAKE -> new ChocolateCakeBuilder("Chocolate Cake");
        };

        System.out.println("\n--- Skapas ---");

        Cake cake = builder.addFirstCakeBase()
                .applyCream()
                .addSecondCakeBase()
                .addAdditionalCream()
                .AddThirdCakeBase()
                .build();

        System.out.println("--- Dekoreras ---");
        DecorationPipeline pipeline = new DecorationPipeline();

        switch (cakeType) {
            case PRINCESS_CAKE ->
                    pipeline.addCommand(new PrincessDecorationCommand((PrincessCake) cake));
            case OPERA_CAKE ->
                    pipeline.addCommand(new OperaDecorationCommand((OperaCake) cake));
            case CHOCOLATE_CAKE ->
                    pipeline.addCommand(new ChocolateDecorationCommand((ChocolateCake) cake));
        }

        pipeline.executeAll();

        customer.fireCakeReadyEvent(cakeType);
        customer.addOrder(cake);
    }
}
