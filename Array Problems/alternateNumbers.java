class alternateNumbers {
    private static int[] alternates(int nums[], int n) {
        int ans[] = new int[nums.length];
        int posIndex = 0, negIndex = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ans[posIndex] = nums[i];
                posIndex += 2;
            } else {
                ans[negIndex] = nums[i];
                negIndex += 2;
            }
        }
        return ans;
    }

    private static void print(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, -2, -5, 2, -4 };
        print(alternates(arr, arr.length));
    }
}
