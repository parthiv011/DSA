import java.util.Vector;

public class subsequences {
    private static void solve(Vector<Vector<String>> ans, Vector<String> input, Vector<String> output, int index) {
        if (index >= input.size()) {
            // base case
            ans.add(output);
            return;
        }
        // exclude
        solve(ans, input, new Vector<String>(output), index + 1);

        // include
        output.add(input.get(index));
        solve(ans, input, new Vector<String>(output), index + 1);
    }

    public static void main(String[] args) {
        Vector<Vector<String>> ans = new Vector<>();
        Vector<String> input = new Vector<>();
        input.add("a");
        input.add("b");
        input.add("c");
        solve(ans, input, new Vector<String>(), 0);
        System.out.println(ans);
    }
}
/*
 * for excluding the null element use
 * add this in base case
 * if(output.size()>0){
 * ans.add(output);
 * }
 */
