import java.util.Scanner;

public class BankDeposit {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền gửi (VND): ");
        double amount = scanner.nextDouble();

        System.out.print("Nhập kỳ hạn gửi (tháng): ");
        int term = scanner.nextInt();

        double interestRate;
        switch (term) {
            case 6:
                interestRate = 5.1;
                break;
            case 9:
                interestRate = 5.5;
                break;
            case 12:
                interestRate = 6.4;
                break;
            case 24:
            case 36:
                interestRate = 6.5;
                break;
            default:
                System.out.println("Kỳ hạn không hợp lệ.");
                return;
        }

        double interest = amount * (interestRate / 100);
        double totalAmount = amount + interest;

        System.out.println("X: " + amount);
        System.out.println("Kỳ hạn: " + term + " tháng");
        System.out.println("Loại tiền gửi: VND");
        System.out.println("Tiền lãi theo kỳ: " + interest);
        System.out.println("Lãi + Gốc: " + totalAmount);
    }
}

