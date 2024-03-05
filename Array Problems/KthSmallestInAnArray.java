//Quick Select Algorithm
//Partitioning approach like quick sort

public class KthSmallestInAnArray {
    private static void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static int partition(int nums[], int low, int high) {
        int pivot = nums[high];
        int pivotLoc = low;

        for (int i = low; i <= high; i++) {
            if (nums[i] < pivot) {
                swap(nums, pivotLoc, i);
                pivotLoc++;
            }
        }
        swap(nums, high, pivotLoc);
        return pivotLoc;

    }

    private static int kthSmallest(int nums[], int low, int high, int k) {
        int p = partition(nums, low, high);
        if (p == k - 1)
            return nums[p];
        else if (p < k - 1) {
            return kthSmallest(nums, p + 1, high, k);
        } else {
            return kthSmallest(nums, low, p - 1, k);
        }

    }

    public static void main(String[] args) {
        int nums[] = { 10, 4, 5, 8, 6, 11, 26 };
        int k = 3;
        int ans = kthSmallest(nums, 0, nums.length - 1, k);
        System.err.println(ans);
    }
}
