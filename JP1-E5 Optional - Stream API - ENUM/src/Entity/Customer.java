package Entity;

public class Customer {
    private int id;
    private String name;
    private Gender gender;
    private int discount;

    public Customer(int id, String name, Gender gender, int discount) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return String.format("%s(%d) - Gender: %s - Discount: %d%%", name, id, gender.getGenderLabel(), discount);
    }

    public void setDiscount(int newDiscount) {
        this.discount = newDiscount;
    }
}
