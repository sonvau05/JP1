package Entity;

public class Technician extends Staff {
    private double overtimePay;

    public Technician(String name, double salary, double overtimePay) {
        super(name, salary);
        this.overtimePay = overtimePay;
    }

    @Override
    public double getPaid() {
        return salary + overtimePay;
    }

    @Override
    public String toString() {
        return "Technician: " + name + ", Salary: " + salary + ", Overtime Pay: " + overtimePay + ", Paid: " + getPaid();
    }
}
