import java.util.ArrayList;
import java.util.List;

public class PhoneKeypadProblem {
    private static void solve(String digits, String output, int index, List<String> ans, String[] mapping) {

        // base case
        if (index >= digits.length()) {
            ans.add(output);
            return;
        }

        int n = digits.charAt(index) - '0';
        String value = mapping[n];
        for (int i = 0; i < value.length(); i++) {
            char ch = value.charAt(i);
            // adding the character to current
            output = output + ch;
            // recursive call
            solve(digits, output, index + 1, ans, mapping);

            // Backtrack to original state
            output = output.substring(0, output.length() - 1);
        }
    }

    public static List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<String>();
        String output = new String();
        int index = 0;
        String[] mapping = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        solve(digits, output, index, ans, mapping);
        return ans;
    }

    public static void main(String[] args) {
        String digits = "";
        System.out.println("Output : " + letterCombinations(digits));
    }
}