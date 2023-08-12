package Week2.Day2;

import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array " );

        int sum = scanner.nextInt();

        int[] arr = new int[sum];

        System.out.println("Enter" + sum + "integers ");
        for (int i = 0; i < sum; i++) {
            arr[i] = scanner.nextInt();
        }

        int avg = calculateSum(arr);
        double average = calculateAvg(arr);
    }

    private static int calculateSum(int[] arr) {

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    private static int calculateAvg(int[] arr) {
        int sum = calculateSum(arr);

        return (int) ((double) sum / arr.length);
        }

    }






