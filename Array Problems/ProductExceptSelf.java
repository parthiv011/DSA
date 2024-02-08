public class ProductExceptSelf {
    private static int[] product(int nums[], int n) {
        int left[] = new int[n];
        int right[] = new int[n];
        int ans[] = new int[n];

        left[0] = 1;
        right[n - 1] = 1;

        int i, j;

        for (i = 1; i < left.length; i++) {
            left[i] = nums[i - 1] * left[i - 1];
        }

        for (j = n - 2; j >= 0; j--) {
            right[j] = nums[j + 1] * right[j + 1];
        }

        for (int k = 0; k < n; k++) {
            ans[k] = left[k] * right[k];
        }

        return ans;
    }

    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = product(arr, n);
        printArray(ans);
    }
}