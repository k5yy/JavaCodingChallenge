package Week2.Day2;

import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {10,25,36,47,58,63};

        checkEvenOdd(numbers);

    }

    private static void checkEvenOdd(int[] arr) {
        for (int num : arr) {
            if (num % 2 == 0){
                System.out.println(num + "is even ");
            } else {
                System.out.println(num + "is odd ");
            }
        }
    }
}
