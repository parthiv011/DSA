import java.util.HashMap;

public class ConsistentStrings {
    private static int counter(String allowed, String[] words) {
        int cnt = words.length;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < allowed.length(); i++) {
            map.put(allowed.charAt(i), 1);
        }

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (map.get(words[i].charAt(j)) == null) {
                    cnt--;
                    break;
                }
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = { "ad", "bd", "aaab", "baa", "badab" };
        int ans = counter(allowed, words);
        System.out.println(ans);
    }
}
