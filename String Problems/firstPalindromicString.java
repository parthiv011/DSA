public class firstPalindromicString {
    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private static String solve(String[] arr) {
        for (String word : arr) {
            if (isPalindrome(word)) {
                return word;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String[] arr = { "abc", "car", "ada", "racecar", "cool" };
        String ans = solve(arr);
        System.out.println(ans);
    }
}
