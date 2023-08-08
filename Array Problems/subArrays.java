// Time complexity : O(n^3)
// Space complexity : O(1)

public class subArrays {
    private static int arr[] = new int[] { 1, 2, 3, 4, 5 };

    private static void subArray(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }

        }
    }

    public static void main(String[] args) {
        System.out.println("The subarrays are as follows : ");
        subArray(arr.length);
    }
}
