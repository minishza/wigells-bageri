package org.app;

import org.app.builder.ChocolateCakeBuilder;
import org.app.builder.OperaCakeBuilder;
import org.app.builder.PrincessCakeBuilder;
import org.app.command.ChocolateDecorationCommand;
import org.app.command.OperaDecorationCommand;
import org.app.command.PrincessDecorationCommand;
import org.app.model.CakeType;
import org.app.model.Customer;
import org.app.model.cake.Cake;
import org.app.model.cake.ChocolateCake;
import org.app.model.cake.PrincessCake;
import org.app.observer.VD;
import org.app.system.OrderHandler;

import java.util.Scanner;

// ============ MAIN ============
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OrderHandler orderHandler = new OrderHandler();
        VD vd = new VD("Wigells VD");

        System.out.print("Namn: ");
        String customerName = scanner.nextLine();
        Customer customer = new Customer(customerName);

        customer.registerObserver(vd);

        boolean continueOrders = true;

        while (continueOrders) {
            System.out.println("\n====== WIGELLS BAGERI ======");
            System.out.println("1. Beställ Prinsesstårta");
            System.out.println("2. Beställ Operatårta");
            System.out.println("3. Beställ Chokladtårta");
            System.out.println("4. Visa beställningshistorik");
            System.out.println("5. Avsluta");
            System.out.print("Välj: ");

            int val = scanner.nextInt();
            scanner.nextLine();

            switch (val) {
                case 1:
                    orderHandler.orderCake(customer, CakeType.PRINCESS_CAKE);
                    break;
                case 2:
                    orderHandler.orderCake(customer, CakeType.OPERA_CAKE);
                    break;
                case 3:
                    orderHandler.orderCake(customer, CakeType.CHOCOLATE_CAKE);
                    break;
                case 4:
                    customer.showCakeHistory();
                    break;
                case 5:
                    continueOrders = false;
                    System.out.println("bye.");
                    break;
                default:
                    System.out.println("WRONG NUMBER");
            }
        }

        scanner.close();
    }
}