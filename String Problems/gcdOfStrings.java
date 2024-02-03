public class gcdOfStrings {

    private static int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

    public static String stringGCD(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1))
            return "";

        int gcd = gcd(str1.length(), str2.length());
        return str2.substring(0, gcd);
    }

    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";

        String ans = stringGCD(str1, str2);
        System.out.println("The GCD of the two strings is: " + ans);
    }
}
