public class kthMissingNumber {
    private static int findKthNumber(int arr[], int k) {
        int s = 0;
        int e = arr.length;

        while (s < e) {
            int mid = s + (e - s) / 2;
            int num = arr[mid] - (mid + 1);

            if (num >= k) {
                e = mid;
            } else {
                s = mid + 1;
            }
        }
        return s + k;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 7, 11 };
        int k = 5;
        int ans = findKthNumber(arr, k);
        System.out.println(ans);
    }
}
