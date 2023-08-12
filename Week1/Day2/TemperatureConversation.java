package Week1.Day2;

import java.util.Scanner;

public class TemperatureConversation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9 /5) + 32;

        System.out.println("Temperature in Fahreheit: " + fahrenheit);


    }
}
