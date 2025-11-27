package org.app;

import org.app.model.Customer;
import org.app.model.CakeType;
import org.app.observer.VD;
import org.app.system.OrderHandler;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VD vd = new VD("Wigells Bageri VD");
        OrderHandler orderHandler = new OrderHandler(vd);

        System.out.print("Namn: ");
        String customerName = scanner.nextLine();
        Customer customer = new Customer(customerName);

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
                case 1 -> orderHandler.orderCake(customer, CakeType.PRINCESS_CAKE);
                case 2 -> orderHandler.orderCake(customer, CakeType.OPERA_CAKE);
                case 3 -> orderHandler.orderCake(customer, CakeType.CHOCOLATE_CAKE);
                case 4 -> customer.showCakeHistory();
                case 5 -> {
                    continueOrders = false;
                    System.out.println("bye.");
                }
                default -> System.out.println("WRONG NUMBER");
            }
        }

        scanner.close();
    }
}
