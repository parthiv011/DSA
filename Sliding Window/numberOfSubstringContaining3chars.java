public class numberOfSubstringContaining3chars {
    private static int substrings(String s) {
        int lastseen[] = { -1, -1, -1 };
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            lastseen[s.charAt(i) - 'a'] = i;
            if (lastseen[0] != -1 && lastseen[1] != -1 && lastseen[2] != -1) {
                int from = Math.min(lastseen[0], Math.min(lastseen[1], lastseen[2]));
                cnt += from + 1;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        String str = "abcabc";
        System.out.println(substrings(str));
    }
}
