class reverseString {
    private static String reverse(String s) {
        String rev = "";
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            rev = ch + rev;
        }
        return rev;
    }

    public static void main(String[] args) {
        String s = "hello";
        System.out.println("Original : " + s);
        String rev = reverse(s);
        System.out.println("Reversed : " + rev);
    }
}