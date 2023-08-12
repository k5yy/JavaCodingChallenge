package Week1.Day5;

import java.util.Scanner;

public class BodyMassIndexCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your weight (kg) ");
        double weight = scanner.nextDouble();

        System.out.println("Enter your height (m)" );
        double height = scanner.nextDouble();

        double bmi = calculateBMI (weight, height);

        scanner.close();
    }

    private static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
}
