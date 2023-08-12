package Week2.Day4;

public class PalindromeChecker {
    private static int i;

    public static void main(String[] args) {
        String input = "Linn ";
        boolean isPalindrome = isPalindrome(input);

        if (isPalindrome) {
            System.out.println("The input string '" + input + "' is a palindrome ");
        } else {
            System.out.println("The input string '" + input + "' is not a palindrome ");
        }
    }

    private static boolean isPalindrome(String str) {

        String cleanStr = str.replace("\\s+ " , "").toLowerCase();

        int length = cleanStr.length();
        for (int i = 0; i < length / 2; i++); {
            if (cleanStr.charAt(i) != cleanStr.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
