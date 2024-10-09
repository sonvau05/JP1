import Entity.Product;
import Entity.Customer;
import Entity.Order;
import Entity.OrderDetail;
import Exceptions.InvalidExceptions;

public class Main {
    public static void main(String[] args) {
        try {
            Product product1 = new Product("MS123456", "Sản phẩm A", 100);
            System.out.println("Tạo sản phẩm thành công: " + product1.getName());

            Customer customer1 = new Customer(1, "Nguyễn Văn A");
            System.out.println("Tạo khách hàng thành công: " + customer1.getName());

            Order order1 = new Order("ORDPM00000001", customer1.getId());
            System.out.println("Tạo đơn hàng thành công: " + order1.getId());

            OrderDetail orderDetail1 = new OrderDetail(1, order1.getId(), product1.getId(), 2);
            System.out.println("Tạo chi tiết đơn hàng thành công: " + orderDetail1.getId());
        } catch (InvalidExceptions.InvalidProductIdException | InvalidExceptions.InvalidProductNameException |
                 InvalidExceptions.InvalidQuantityException | InvalidExceptions.InvalidCustomerNameException |
                 InvalidExceptions.InvalidOrderIdException e) {
            System.out.println(e.getMessage());
        }
    }
}
