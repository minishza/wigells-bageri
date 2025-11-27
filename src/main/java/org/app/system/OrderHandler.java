package org.app.system;

import org.app.builder.CakeBuilder;
import org.app.builder.ChocolateCakeBuilder;
import org.app.builder.OperaCakeBuilder;
import org.app.builder.PrincessCakeBuilder;
import org.app.command.*;
import org.app.command.chocolate.ChocolateAddGanashCommand;
import org.app.command.chocolate.ChocolateAddGarnishCommand;
import org.app.command.chocolate.ChocolateApplyCreamCommand;
import org.app.command.opera.OperaAddGarnishCommand;
import org.app.command.opera.OperaAddSugarCommand;
import org.app.command.opera.OperaApplyCreamCommand;
import org.app.command.opera.OperaApplyMarzipanCommand;
import org.app.command.princess.PrincessAddGarnishCommand;
import org.app.command.princess.PrincessAddSugarCommand;
import org.app.command.princess.PrincessApplyCreamCommand;
import org.app.command.princess.PrincessApplyMarzipanCommand;
import org.app.model.CakeType;
import org.app.model.Customer;
import org.app.model.cake.*;
import org.app.observer.VD;

public class OrderHandler {
    private VD vd;

    public OrderHandler(VD vd) {
        this.vd = vd;
    }

    public void orderCake(Customer customer, CakeType cakeType) {
        System.out.println("\n++++++ NEW CAKE ++++++");
        System.out.println("Customer: " + customer.getName());
        System.out.println("Typ: " + cakeType);

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

        cake.addPropertyChangeListener(vd);

        System.out.println("--- Dekoreras ---");
        DecorationPipeline pipeline = new DecorationPipeline();

        switch (cakeType) {
            case PRINCESS_CAKE -> {
                PrincessCake princessCake = (PrincessCake) cake;
                pipeline.addCommand(new PrincessApplyCreamCommand(princessCake));
                pipeline.addCommand(new PrincessApplyMarzipanCommand(princessCake));
                pipeline.addCommand(new PrincessAddGarnishCommand(princessCake));
                pipeline.addCommand(new PrincessAddSugarCommand(princessCake));
            }
            case OPERA_CAKE -> {
                OperaCake operaCake = (OperaCake) cake;
                pipeline.addCommand(new OperaApplyCreamCommand(operaCake));
                pipeline.addCommand(new OperaApplyMarzipanCommand(operaCake));
                pipeline.addCommand(new OperaAddGarnishCommand(operaCake));
                pipeline.addCommand(new OperaAddSugarCommand(operaCake));
            }
            case CHOCOLATE_CAKE -> {
                ChocolateCake chocolateCake = (ChocolateCake) cake;
                pipeline.addCommand(new ChocolateApplyCreamCommand(chocolateCake));
                pipeline.addCommand(new ChocolateAddGanashCommand(chocolateCake));
                pipeline.addCommand(new ChocolateAddGarnishCommand(chocolateCake));
            }
        }

        pipeline.executeAll();

        cake.notifyReadyForPickup();
        customer.addOrder(cake);
    }
}
