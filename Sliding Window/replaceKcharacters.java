import java.util.Arrays;

public class replaceKcharacters {
    public static int replace(String s, int k) {
        int count = 0;
        int maxFreq = 0;
        int hash[] = new int[26];
        Arrays.fill(hash, -1);
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                hash[s.charAt(j) - 'A']++;
                maxFreq = Math.max(maxFreq, hash[s.charAt(j)]);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "AABABBA";
        int k = 2;
        System.out.println(replace(str, k));
    }
}
