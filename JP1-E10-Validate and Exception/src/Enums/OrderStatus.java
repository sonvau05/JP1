package Enums;

public enum OrderStatus {
    PENDING("Chờ xử lý"),
    COMPLETED("Đã hoàn thành"),
    CANCEL("Hủy"),
    PAID("Đã thanh toán");

    private String label;

    OrderStatus(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}


