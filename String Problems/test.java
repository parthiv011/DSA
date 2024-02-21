public class test {
    private int x;
    private String str;
    private int[] arr;
    private boolean ans;

    test(int x, String str, int[] arr, boolean ans) {
        this.x = x;
        this.str = str;
        this.arr = arr;
        this.ans = ans;
    }

    public static void main(String[] args) {
        test t1 = new test(5, "Hello", new int[] { 1, 2, 3 }, true);
        System.out.println("Value of x: " + t1.x);
        System.out.println("Value of str: " + t1.str);
    }
}
