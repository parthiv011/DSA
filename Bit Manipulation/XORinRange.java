
// find xor in range of 0 -> n
import java.util.*;

public class XORinRange {
    private static int XOR(int n) {
        if (n % 4 == 3) {
            return 0;
        } else if (n % 4 == 0) {
            return n;
        } else if (n % 4 == 2) {
            return n + 1;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = XOR(n);
        System.out.println("The xor value from 0 to " + n + " is: " + ans);
    }
}
