package Week1.Day3;

import java.util.Scanner;

public class Countingwithdowhilleloop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the limit for counting: ");
        int limit = scanner.nextInt();

        int x = 1;
        do {
            System.out.println(x + " ");
            x++;
        } while (x <= limit);
        System.out.println(); // Move to the next line after printing the numbers.

        scanner.close();
    }
}
