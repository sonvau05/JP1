import Entity.Customer;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Customer customer = new Customer();
        Customer customer1 = new Customer( 1, "Mr Bean");
//        //Change name Mr Bean to Bill Gate
        customer1.setName("Bill Gate");
//        customer1.name = "Bean";
//        System.out.println("Id: " + customer1.getId()
//        +"\nName: " + customer1.getName());
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id: ");
        int id = sc.nextInt();
        System.out.println("Enter name: ");
        String name = sc.next();
        Customer customer2 = new Customer( id, name);
        System.out.println(customer2);


    }
}