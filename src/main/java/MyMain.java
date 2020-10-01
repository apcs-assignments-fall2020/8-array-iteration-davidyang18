import java.util.Arrays;

public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int storage = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = storage;
        }
        return arr;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        int storage;
        for (int i = 0; i < arr.length; i++) {
            for (int a = i + 1; a < arr.length; a++) {
                if (arr[i] > arr[a]) { // sort the array 
                    storage = arr[i]; 
                    arr[i] = arr[a];
                    arr[a] = storage;
                }
            }
        }
        return arr[arr.length - 2];
    }

    // Checks to see if an array contains a geometric series
    public static boolean isGeometric(int[] arr) {
        if (arr.length == 1) {
            return true;
        }
        int ratio = arr[1] / (arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] / (arr[i - 1])) != ratio) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6,5,7};
        System.out.println(Arrays.toString(reverse(arr)));
        System.out.println(secondLargest(arr));
        System.out.println(isGeometric(arr));
    }
}
