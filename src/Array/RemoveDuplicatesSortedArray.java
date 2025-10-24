package Array;

public class RemoveDuplicatesSortedArray {

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,2};
        removeDuplicates(arr);
    }

    private static void removeDuplicates(int[] arr) {
        int i = 0;

        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                arr[++i] = arr[j];
            }
        }

        System.out.println(i + 1);
    }
}
