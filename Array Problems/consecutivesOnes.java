public class consecutivesOnes {
    private static int countFunction(int arr[]) {
        int cnt = 0, maxCnt = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                cnt++;
            } else {
                cnt = 0;
            }
            if (maxCnt < cnt) {
                maxCnt = cnt;
            }
        }
        return maxCnt;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 1, 1, 0, 1, 1, 1, 0, 1, 1 };
        int ans = countFunction(arr);
        System.out.println("Max occurrence of 1's : " + ans);
    }
}
