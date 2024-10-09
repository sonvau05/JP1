package Entity;

import Exceptions.TooColdException;
import Exceptions.TooHotException;
import Exceptions.UnusualTasteException;

public class VirtualPerson {
    private static final int tooCold = 65;
    private static final int tooHot = 85;

    public void drinkCoffee(CoffeeCup cup) throws TooColdException, TooHotException, UnusualTasteException {
        int temperature = cup.getTemperature();
        if (temperature <= tooCold) {
            throw new TooColdException(temperature);
        } else if (temperature >= tooHot) {
            throw new TooHotException(temperature);
        } else if (Math.random() > 0.9) { // Xác suất xảy ra lỗi hương vị bất thường
            throw new UnusualTasteException("Cà phê này có hương vị lạ.");
        }
    }
}





