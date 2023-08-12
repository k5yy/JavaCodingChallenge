package Week1.Day3;
import java.util.Scanner;
public class CountingWithForLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the limit for counting: ");
        int Limit =scanner.nextInt();

        for (int i = 1; i <= Limit; i++) {
            if (i%2 == 0){
                System.out.println(i + " ");
            }


        }
        System.out.println();
        scanner.close();

    }


}
