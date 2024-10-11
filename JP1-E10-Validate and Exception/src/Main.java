import Entity.Customer;
import Entity.Order;
import Entity.OrderDetail;
import Entity.Product;
import Enums.OrderStatus;
import Service.CustomerService;
import Service.OrderDetailService;
import Service.OrderService;
import Service.ProductService;

public class Main {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        OrderService orderService = new OrderService();
        ProductService productService = new ProductService();
        OrderDetailService orderDetailService = new OrderDetailService();

        // Example usage
        try {
            Customer customer = new Customer(1, "Messi");
            customerService.add(customer);
            System.out.println("Customer added: " + customer.getName());

            Product product = new Product("MS194124", "Product A", 100);
            productService.add(product);
            System.out.println("Product added: " + product.getId() + " - " + product.getName());

            Order order = new Order("ORDPM01234567", customer.getId());
            orderService.add(order);
            System.out.println("Order created: " + order.getId());

            OrderDetail orderDetail = new OrderDetail(1, order.getId(), product.getId(), 10);
            orderDetailService.add(orderDetail);
            System.out.println("Order detail added: " + orderDetail.getQuantity());
        } catch (RuntimeException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}







