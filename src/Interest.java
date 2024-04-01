// Thực hành ứng dụng tính tiền lãi cho vay

import java.util.*;

public class Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter investment amout: ");
        double money = scanner.nextDouble();

        System.out.print("Enter number of months: ");
        int month = scanner.nextInt();

        System.out.print("Enter annual interest rate in percentage: ");
        double interestRate = scanner.nextDouble();

        double totalInterest = 0;

        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate / 100) / 12 * month;
        }

        System.out.println("Total of interest: " + totalInterest);
    }
}
