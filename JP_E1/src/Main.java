import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Chọn chức năng:");
            System.out.println("0. Thoát");
            System.out.println("1. Máy rút tiền ATM");
            System.out.println("2. Gửi tiền vào Ngân hàng");
            System.out.print("Lựa chọn của bạn: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    return;
                case 1:
                    ATM atm = new ATM();
                    atm.run();
                    break;
                case 2:
                    BankDeposit bankDeposit = new BankDeposit();
                    bankDeposit.run();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}
