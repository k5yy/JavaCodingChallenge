package Week1.Day4;

import java.util.Scanner;

public class FizzBuzzGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the limit for FizzBuzz game: ");
        int limit = scanner.nextInt();

        for (int i = 1; i <= limit; i++) {
            if (i % 3 == 0 && i % 5== 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
