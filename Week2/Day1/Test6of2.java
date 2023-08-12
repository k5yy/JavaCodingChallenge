package Week2.Day1;

import java.util.Scanner;

public class Test6of2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the array ");
        int length = scanner.nextInt();

        int[] a = new int [length];

        for (int i = 0; i < length; i++) {
            System.out.println(" Enter element " +(i +1) + ":");
            a[i] =  scanner.nextInt();

        }
        scanner.close();

        int sum = 0;

        for (int i = 0; i < length; i++){
            sum += a[i];
        }

        System.out.println("Sum of elements of the array " + sum);
    }
}
