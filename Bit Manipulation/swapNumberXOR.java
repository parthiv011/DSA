public class swapNumberXOR {
    private static void swap(int[] arr) {
        arr[0] = arr[0] ^ arr[1];
        arr[1] = arr[0] ^ arr[1];
        arr[0] = arr[0] ^ arr[1];
    }

    public static void main(String[] args) {
        int a = 3, b = 7;
        System.out.println(a + " " + b);

        int[] nums = { a, b };
        swap(nums);
        a = nums[0];
        b = nums[1];

        System.out.println(a + " " + b);
    }
}
