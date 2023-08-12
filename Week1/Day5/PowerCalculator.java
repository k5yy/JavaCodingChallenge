package Week1.Day5;

import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base number ");
        int base = scanner.nextInt();

        System.out.println("Enter the exponent ");
        int exponent = scanner.nextInt();

        int result = 1;
        for (int r = 1; r <= exponent; r++) {
            result *= base;
        }
        System.out.println(base + "^" + exponent + " = " + result);

        scanner.close();

    }
}
