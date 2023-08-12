package Week1.Day3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println ("Please enter your age");
        int age = scanner.nextInt();

        if (age <= 13){
            System.out.println("you are a child");}
        else if (age<=30){
            System.out.println("you are young");
        }
        else if (age<=50){
            System.out.println("you are old");
        }
        scanner.close();
    }
}
