package Entity;

public class Customer {
    //property(id, Name, Gender, Address, phoneNumber,email)
    private int id;
    private String name;
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

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' + +
                '}';
    }
}


