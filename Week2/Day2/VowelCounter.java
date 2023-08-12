package Week2.Day2;

import java.util.Scanner;

public class VowelCounter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence ");
        String sentence = scanner.nextLine().toLowerCase();

        int vowelCount = countVowels(sentence);
        System.out.println("Number of vowels in the sentence " + vowelCount);

        scanner.close();

    }

    private static int countVowels(String str) {

        int count = 0;

        for (int i = 0; i< str.length(); i++) {
            char ch = str.charAt(i);

            if (isVowel(ch)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isVowel(char ch) {

        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
