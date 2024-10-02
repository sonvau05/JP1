package Entity;

public abstract class Staff {
    protected String name;
    protected double salary;

    public Staff(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public abstract double getPaid();

    @Override
    public abstract String toString();
}

