package Service;

import Entity.CoffeeCup;
import Entity.VirtualPerson;
import Exceptions.TooColdException;
import Exceptions.TooHotException;
import Exceptions.UnusualTasteException;

public class VirtualCafe {
    public static void serveCustomer(VirtualPerson cust, CoffeeCup cup) {
        try {
            cust.drinkCoffee(cup);
            System.out.println("Coffee is just right.");
        } catch (TooColdException e) {
            System.out.println("Coffee is too cold: " + e.getTemperature() + "°C");
        } catch (TooHotException e) {
            System.out.println("Coffee is too hot: " + e.getTemperature() + "°C");
        } catch (UnusualTasteException e) {
            System.out.println("This coffee tastes like tea.");
            String s = e.getMessage();
            if (s != null) {
                System.out.println(s);
            }
        }
    }
}












