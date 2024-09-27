package Entity;

public class Staff extends Person {
    private String id;
    private String school;
    private double pay;
    private Gender gender;

    public Staff() {
    }

    public Staff(String id, String name, String address, String school, double pay, Gender gender) {
        super(name, address);
        this.id = id;
        this.school = school;
        this.pay = pay;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id='" + id + '\'' +
                ", name='" + this.getName() +
                ", school='" + school +
                ", pay=" + pay +
                ", address='" + this.getAddress() +
                ", gender=" + gender +
                '}';
    }
}


