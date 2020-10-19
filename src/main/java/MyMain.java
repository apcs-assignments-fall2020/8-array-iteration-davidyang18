import java.util.Arrays;
// Code by David Yang, with the help from Neiman Chen on method "IsGeometric" "double" logic.
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
        double ratio = ((double) (double)arr[1] / (double)arr[0]);
        // index 6 out of range error wont happen.
        for (int i = 0; i < arr.length - 1; i++) {
            if ((double) (arr[i + 1]) / (double)arr[i] != ratio) {
                return false;
            }
        }           
        return true;        
    }


    public static void main(String[] args) {
        int arr[] = {1,2,4,8,15,16};
        int arr1[] = {1,2,4,8,16,32};
        System.out.println(Arrays.toString(reverse(arr)));
        System.out.println(secondLargest(arr));
        System.out.println(isGeometric(arr1));
    }
}
