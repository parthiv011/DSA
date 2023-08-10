public class unionOfSortedArrays {
    private static int[] merge(int arr1[], int arr2[]) {
        int ans[] = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                ans[k++] = arr1[i++];
            } else {
                ans[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            if (arr1[i] < arr2[j]) {
                ans[k++] = arr1[i++];
            }
        }
        while (j < arr2.length) {
            if (arr2[j] < arr1[i])
                ans[k++] = arr2[j++];
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr1[] = new int[] { 1, 2, 3, 4 };
        int arr2[] = new int[] { 2, 4, 5, 6, 7, 8 };
        int ans[] = merge(arr1, arr2);
        for (int i : ans) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
}