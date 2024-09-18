import java.util.Scanner;

public class ATM {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền cần rút (bội số của 50.000 VND): ");
        int amount = scanner.nextInt();

        if (amount % 50000 != 0) {
            System.out.println("Số tiền cần rút phải là bội của 50.000 VND.");
        } else {
            int count500 = 0, count200 = 0, count100 = 0, count50 = 0;

            if (amount >= 500000) {
                count500 = amount / 500000;
                amount %= 500000;
            }

            if (amount >= 200000) {
                count200 = amount / 200000;
                amount %= 200000;
            }

            if (amount >= 100000) {
                count100 = amount / 100000;
                amount %= 100000;
            }

            if (amount >= 50000) {
                count50 = amount / 50000;
                amount %= 50000;
            }

            int totalNotes = count500 + count200 + count100 + count50;

            System.out.println("X: " + (amount + count500 * 500000 + count200 * 200000 + count100 * 100000 + count50 * 50000));
            System.out.println("Tờ 500: " + count500);
            System.out.println("Tờ 200: " + count200);
            System.out.println("Tờ 100: " + count100);
            System.out.println("Tờ 50: " + count50);
            System.out.println("Tổng số tờ: " + totalNotes);
        }
    }
}

