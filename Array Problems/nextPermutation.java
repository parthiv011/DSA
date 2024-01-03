public class nextPermutation {
    private static void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int nums[], int start) {
        int i = start;
        int j = nums.length - 1;

        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private static void permute(int nums[]) {
        int n = nums.length;
        int index = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        if (index == -1)
            reverse(nums, 0);
        else {
            for (int i = n - 1; i >= 0; i++) {
                if (nums[i] > nums[index]) {
                    swap(nums, index, i);
                    break;
                }
            }
            reverse(nums, index + 1);
        }
    }

    public static void main(String[] args) {
        int nums[] = { 5, 3, 1 };

        permute(nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
}