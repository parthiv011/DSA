class SumOfSubarrays {
    private static int sum(int arr[], int size) {
        int ans = 0, temp = 0;

        for (int i = 0; i < size; i++) {
            temp = 0;
            for (int j = i; j < size; j++) {
                temp += arr[j];
                ans += temp;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 7, 9 };
        int ans = sum(arr, 5);
        System.out.println(ans);
    }
}