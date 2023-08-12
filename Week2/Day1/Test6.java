package Week2.Day1;

public class Test6 {

    public static void main(String[] args) {
//Initializing the first value
        int[] arr = {1,2,3,4};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
        }

        System.out.println("Sum of all values in the array " + sum);
    }
}
