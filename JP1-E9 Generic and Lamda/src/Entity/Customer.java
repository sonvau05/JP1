package Entity;

import Entity.Gender;

public class Customer {
    private int id;
    private String name;
    private Gender gender;
    private int discount;


    public Customer(int id, String name, Gender gender, int discount ) {
        this.name = name;
        this.gender = gender;
        this.id = id;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", discount=" + discount +
                '}';
    }
}
