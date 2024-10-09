package Service;

import Entity.CoffeeCup;
import Entity.VirtualPerson;

public class Main {
    public static void main(String[] args) {
        CoffeeCup cup = new CoffeeCup();
        cup.setTemperature(90);

        try {
            VirtualPerson cust = new VirtualPerson();
            VirtualCafe.serveCustomer(cust, cup);
        } catch (Exception e) {
            System.out.println("This coffee tastes like tea.");
        }
    }
}




