package Week2.Day4;

public class SwapNumber {
    public static void main(String[] args) {
        int x = 4;
        int y = 7;

        int temp = x;
        x = y;
        y = temp;

        System.out.println("After swapping ");
        System.out.println("x = " + x );
        System.out.println("y = " + y);
    }
}
