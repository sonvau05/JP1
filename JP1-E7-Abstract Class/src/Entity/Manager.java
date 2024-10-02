package Entity;

public class Manager extends Staff {
    private double allowance;

    public Manager(String name, double salary, double allowance) {
        super(name, salary);
        this.allowance = allowance;
    }

    @Override
    public double getPaid() {
        return salary + allowance;
    }

    @Override
    public String toString() {
        return "Manager: " + name + ", Salary: " + salary + ", Allowance: " + allowance + ", Paid: " + getPaid();
    }
}
