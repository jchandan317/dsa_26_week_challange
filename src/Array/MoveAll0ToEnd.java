package Array;

import java.util.Arrays;

public class MoveAll0ToEnd {

    public static void main(String[] args) {
        int[] arr = {0,1,0,1,2,3,4};

        moveZeros(arr);
    }

    private static void moveZeros(int[] arr) {
        int insertIndex = 0;

        for (int num : arr) {
            if (num != 0) {
                arr[insertIndex++] = num;
            }
        }

        while (insertIndex < arr.length) {
            arr[insertIndex++] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }


}
