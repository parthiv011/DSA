public class singleNumber {
    private static int number(int arr[]) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 4, 1, 2, 1, 4 };
        int ans = number(arr);
        System.out.println(ans);
    }
}