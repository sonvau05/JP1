import Entity.*;
import Service.*;
import Enums.OrderStatus;

public class Main {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        CustomerService customerService = new CustomerService();
        OrderService orderService = new OrderService();
        OrderDetailService orderDetailService = new OrderDetailService();

        Product product = new Product("MS000001", "Sản phẩm A", 100);
        productService.addProduct(product);
        System.out.println("Sản phẩm đã thêm: " + product.getId() + ", Tên: " + product.getName() + ", Số lượng: " + product.getQuantity());

        Customer customer = new Customer(1, "Nguyễn Văn A");
        customerService.addCustomer(customer);
        System.out.println("ID khách hàng: " + customer.getId() + ", Tên: " + customer.getName());

        Order order = new Order("ORDPM00000001", customer.getId());
        orderService.addOrder(order);
        System.out.println("Đơn hàng đã thêm: " + order.getId() + ", Khách hàng ID: " + order.getId());

        OrderDetail orderDetail = new OrderDetail(1, order.getId(), product.getId(), 2);
        orderDetailService.addOrderDetail(orderDetail);
        System.out.println("Chi tiết đơn hàng: ID: " + orderDetail.getId() + ", ID đơn hàng : " + orderDetail.getOrderId() + ", ID sản phẩm: " + orderDetail.getProductId() + ", Số lượng: " + orderDetail.getQuantity());

        orderService.updateOrderStatus(order.getId(), OrderStatus.COMPLETED);
        System.out.println("Trạng thái đơn hàng đã cập nhật: " + order.getId() + " - " + OrderStatus.COMPLETED);
    }
}




