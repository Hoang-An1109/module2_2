// Thực hành tim số ước chung lớn nhất

import java.util.*;

public class GreatestCommonFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = scanner.nextInt();

        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 && b == 0) {
            System.out.println("No greatest common factor");
        } else {
            if (a == 0) {
                System.out.println("Greatest common factor: " + b);
            } else {
                if (b == 0) {
                    System.out.println("Greatest common factor: " + a);
                } else {
                    while (a != b) {
                        if (a > b)
                            a = a - b;
                        else
                            b = b - a;
                    }
                    System.out.println("Greatest common factor: " + a);
                }
            }
        }
    }
}
