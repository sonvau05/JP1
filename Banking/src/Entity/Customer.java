package Entity;

public class Customer {
    //property(id, Name, Gender, Address, phoneNumber,email)
    private int id;
    private String name;
    private String address;
    private String gender;
    private String phone;
    private String email;
    //Method
    //Constructor
    public Customer(){
        System.out.println("This is Customer Constructor");
    }

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return this.address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getGender() {
        return this.gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getPhone() {
        return this.phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "{Id" + this.getId() +
                "; Name: " + this.getName() +
                "}";
        }
    }


