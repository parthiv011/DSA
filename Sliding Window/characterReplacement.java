public class characterReplacement {
    // 1. Brute force approach
    // private static int characterReplacement(String str, int k) {
    // int maxLength = 0;
    // int hash[];

    // for (int i = 0; i < str.length(); i++) {
    // int maxFreq = 0;
    // hash = new int[26];
    // for (int m = 0; m < 26; m++) {
    // hash[m] = 0;
    // }

    // for (int j = 0; j < str.length(); j++) {
    // hash[str.charAt(j) - 'A']++;
    // maxFreq = Math.max(maxFreq, hash[str.charAt(j) - 'A']);
    // int changes = (j - i + 1) - maxFreq;
    // if (changes <= k) {
    // maxLength = Math.max(maxLength, j - i + 1);
    // } else {
    // break;
    // }
    // }
    // }
    // return maxLength;
    // }

    // 2.Sliding Window
    private static int characterReplacement(String str, int k) {
        int maxLen = 0;
        int left = 0, right = 0;
        int hash[] = new int[26];
        int maxfreq = 0;
        while (right < str.length()) {
            hash[str.charAt(right) - 'A']++;
            maxfreq = Math.max(maxfreq, hash[str.charAt(right) - 'A']);
            int changes = (right - left + 1) - maxfreq;

            if (changes > k) {
                hash[str.charAt(left) - 'A']--;
                left++;
            } else {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
        }
        return maxLen;
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String test = "AABABBA";
        // int[] ans = characterReplacement(test, 2);
        // printArray(ans);
        int ans = characterReplacement(test, 1);
        System.out.println(ans);
    }
}
