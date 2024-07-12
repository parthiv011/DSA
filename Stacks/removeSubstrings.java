import java.util.Stack;

public class removeSubstrings {
    private static String reverseParenthesis(String s) {
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(sb.toString());
                sb.setLength(0);
            } else if (ch == ')') {
                sb.reverse();
                sb.insert(0, stack.pop());
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "(par(vi(th)))";
        String ans = reverseParenthesis(str);
        System.out.println(ans);
    }
}
