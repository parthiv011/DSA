public class pivot {
    private static int getPivot(int arr[], int n) {
        int s = 0;
        int e = arr.length - 1;
        int mid = s + (e - s) / 2;
        while (s < e) {
            if (arr[mid] >= arr[0])
                s = mid + 1;
            else
                e = mid;

            mid = s + (e - s) / 2;
        }
        return s;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 4, 5, 6, 7, 0, 1, 2 };
        int ans = getPivot(arr, 7);
        System.out.println(ans);
    }
}
