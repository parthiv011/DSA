import java.util.Scanner;

public class reverseWords {
    private static void swapper(String[] str, int i, int j) {
        String temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }

    private static String reverse(String s) {
        s = s.trim();

        String[] str = s.split("\\s+");
        int i = 0, j = str.length - 1;

        while (i < j) {
            swapper(str, i++, j--);
        }

        String ans = String.join(" ", str);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of testcases: ");
        int testCases = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < testCases; i++) {
            System.out.println("Enter the string no " + i + 1);
            String str = sc.nextLine();
            String ans = reverse(str);
            System.out.println("Answer is  : " + ans);
        }
    }
}
