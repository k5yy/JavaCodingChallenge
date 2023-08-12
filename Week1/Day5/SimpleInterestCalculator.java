package Week1.Day5;

import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the principal amount ");
        double principal = scanner.nextDouble();

        System.out.println("Enter the rate of interest ");
        double rateOfInterest = scanner.nextDouble();

        System.out.println("Enter the time period in years ");
        double timePeriod = scanner.nextDouble();

        double simpleInterest = (principal * rateOfInterest * timePeriod);

        System.out.println("Simple Interest " + simpleInterest);

        scanner.close();

    }
}
