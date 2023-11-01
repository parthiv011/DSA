import java.util.Scanner;

public class fibonnaci {
    private static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = 0;
        int second = 1;
        System.out.println("Enter Number of terms : ");
        int n = sc.nextInt();
        System.out.println("Fibonacci  Sequence : ");
        for (int i = 0; i <= n; i++) {
            System.out.print(first + " ");
            int result = first + second;
            first = second;
            second = result;
        }
        System.out.println();
        System.out.println("Recursive Fibonacci  sequence : ");
        for (int i = 0; i <= n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
