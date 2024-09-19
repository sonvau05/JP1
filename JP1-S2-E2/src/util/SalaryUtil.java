package util;

public class SalaryUtil {

    public static int calculateAnnualSalary(int monthlySalary) {
        return monthlySalary * 12;
    }

    public static int calculateRaisedSalary(int currentSalary, int percent) {
        return currentSalary + (currentSalary * percent / 100);
    }
}


