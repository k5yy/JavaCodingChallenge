package Week2.Day3;

public class ArrayElementSearch {
    public static int findElementIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[ ] array = {1,9,4,8,5,7 };
        int elementToFind = 4;

        int index = findElementIndex(array, elementToFind);

        if (index !=1) {

            System.out.println("The element " + elementToFind + "is found at index " + index);
        } else {
            System.out.println("The element " + elementToFind + "is not found in the array ");
        }
    }
}

