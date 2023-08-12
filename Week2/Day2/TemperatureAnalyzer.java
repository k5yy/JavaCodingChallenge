package Week2.Day2;

import java.util.Scanner;

public class TemperatureAnalyzer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] temperatures = { 22,24,25,26,27,28,29,30};

        int maxTemperature = findMaxTemperature(temperatures);
        int minTemperature = findMinTemperature(temperatures);
        double averageTemperature = findAverageTemperature(temperatures);

        System.out.println("Maximum Temperature " + maxTemperature );
        System.out.println("Minium Temperature " + minTemperature );
        System.out.println("Average Temperature " + averageTemperature);
    }

    private static double findAverageTemperature(int[] temperatures) {
        int sum = 0;
        for (int temp : temperatures) {
            sum+= temp;
        }
        return (double) sum / temperatures.length;
    }

    private static int findMinTemperature(int[] temperatures) {
        int minTemp = temperatures[0];
        for (int temp : temperatures) {
            if (temp < minTemp) {
                minTemp = temp;
            }
        }
        return minTemp;
    }

    private static int findMaxTemperature(int[] temperatures) {
        int maxTemp = temperatures[0];
        for (int temp : temperatures) {
            if (temp > maxTemp) {
                maxTemp = temp;
            }
        }
        return maxTemp;
    }
}
