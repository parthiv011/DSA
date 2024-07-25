import java.util.HashMap;

public class substringwithKdistinctChars {
    public static int Kdistinct(String s, int k) {
        int maxLen = 0;
        int r = 0, l = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        while (r < s.length()) {
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
            while (map.size() > k) {
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                if (map.get(s.charAt(l)) == 0) {
                    map.remove(s.charAt(l));
                }
                l++;
            }
            maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }
        return maxLen;
    }
    // 1. Brute Force TC-> O(N2) SC-> O(256)
    // public static int Kdistinct(String s, int k) {
    // int maxLen = 0;
    // Map<Character, Integer> map = new HashMap<>();

    // for (int i = 0; i < s.length(); i++) {
    // map.clear();
    // for (int j = i; j < s.length(); j++) {
    // map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
    // if (map.size() <= k) {
    // maxLen = Math.max(maxLen, j - i + 1);
    // } else {
    // break;
    // }
    // }
    // }
    // return maxLen;
    // }

    public static void main(String[] args) {
        String s = "aaabbccd";
        int ans = Kdistinct(s, 2);
        System.out.println(ans);
    }
}
