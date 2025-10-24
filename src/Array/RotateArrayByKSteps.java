package Array;

import java.util.Arrays;

public class RotateArrayByKSteps {

    private static void reverse(int[] arr, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
            endIndex--;
            startIndex++;
        }
    }

    private static void rotateByK(int[] arr, int k) {
        int length = arr.length;
        k = k % length;
        reverse(arr, 0, length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, length - 1);

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};

        rotateByK(arr, 2);
    }
}
