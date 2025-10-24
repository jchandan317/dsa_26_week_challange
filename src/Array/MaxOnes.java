package Array;

public class MaxOnes {

    public static void main(String[] args) {
        int[] arr = {1,2,1,1,1,1,2,1,1,11,1,1,1,1,1,11,1,1,1,11,1,11,1,11,1,11,1,11};
        maxOne(arr);
    }

    private static void maxOne(int[] arr) {
        int count = 0;
        int maxCount = 0;

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == 1) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }

        System.out.println(maxCount);
    }
}
