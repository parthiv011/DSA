public class checkpalindrome {
    public static boolean isPalindrome(String s) {
        boolean ans = solve(s, 0, s.length() - 1);
        return ans;
    }

    private static boolean solve(String s, int i, int j) {
        if (i >= j) {
            return true;
        }
        if (s.charAt(i) != s.charAt(j)) {
            return false;
        } else {
            i++;
            j--;
        }
        return solve(s, i, j);
    }

    public static void main(String[] args) {
        String s = "acecar";
        if (isPalindrome(s)) {
            System.out.println("The string " + s + " is a palindrome");
        } else {
            System.out.println("The string " + s + " is not palindrome");
        }
    }
}
