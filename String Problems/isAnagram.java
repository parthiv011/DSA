import java.util.HashMap;
import java.util.Set;

public class isAnagram {
    private static boolean checkAnagram(String a, String b) {
        if (a.length() != b.length())
            return false;

        HashMap<Character, Integer> mpp = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            if (mpp.containsKey(a.charAt(i))) {
                mpp.put(a.charAt(i), mpp.get(a.charAt(i)) + 1);
            } else {
                mpp.put(a.charAt(i), 1);
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if (mpp.containsKey(b.charAt(i))) {
                mpp.put(b.charAt(i), mpp.get(b.charAt(i)) - 1);
            } else {
                return false;
            }
        }
        Set<Character> set = mpp.keySet();
        for (Character i : set) {
            if (mpp.get(i) != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "main";
        String str2 = "aim";
        if (checkAnagram(str1, str2)) {
            System.out.println("Strings are anagrams");
        } else {
            System.out.println("Strings are not anagram");
        }
    }
}
