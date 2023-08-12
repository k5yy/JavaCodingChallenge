package Week2.Day4;

public class FindTheWord {
    public static String findNthWord(String input, int n) {

        String[] words = input.split("\\s+");

        int numWords = words.length;

        if (n > 0 && n <= numWords) {
            return words[n - 1];
        } else {
            return "Invalid input";
        }
    }

    public static void main(String[] args) {
        String inputString = "I love Code-academy";
        int n = 2;
        String result = findNthWord(inputString, n);
        System.out.println("Second-to-last word " + result );

        String inputString2 = "I can program in Java ";
        int n2 = 3;
        String result2 = findNthWord(inputString2, n2);
        System.out.println("Third word " + result2);

    }
}
