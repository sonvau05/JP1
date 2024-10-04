package Entity;

public class Customer {
    private int id;
    private String name;
    private String code;
    private Gender gender;

    public Customer() {;}

    public Customer(int id, String name, String code, Gender gender) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public Gender getGender() {
        return gender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", gender=" + gender +
                '}';
    }
}


