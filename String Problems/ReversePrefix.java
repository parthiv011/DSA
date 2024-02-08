class ReversePrefix {
    private static int firstOccurence(String s, char ch) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch)
                return i;
        }
        return -1;
    }

    public static String reversePrefix(String word, char ch) {
        int index = firstOccurence(word, ch);
        if (index > 0) {
            String ans = "";
            for (int i = index; i >= 0; i--) {
                ans += word.charAt(i);
            }
            return ans + word.substring(index + 1);

        }
        return word;
    }

    public static void main(String[] args) {
        String str = "rzwuktxcjfpamlonbgyieqdvhs";
        char ch = 'z';
        int ans = firstOccurence(str, ch);
        System.out.println(ans);
        String ans1 = reversePrefix(str, ch);
        System.out.println(ans1);
    }
}