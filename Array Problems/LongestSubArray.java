
public class LongestSubArray {
    private static int subArray(int arr[], int k) {
        int n = arr.length;
        int left = 0, right = 0;
        long sum = arr[0];
        int maxLen = 0;
        while (right < n) {
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
            if (right < n)
                sum += arr[right];
        }
        return maxLen;
    }

    public static void main(String[] args) {

        int arr[] = new int[] { 1, 2, 1 };
        int x = subArray(arr, 3);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Max length of subarray : " + x);
    }

}