import java.util.HashMap;

public class isPangram {
    private static boolean checkPangram(String sentence) {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        HashMap<Character, Integer> mpp = new HashMap<>();

        for (int i = 0; i < letters.length(); i++) {
            mpp.put(letters.charAt(i), 0);
        }

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            mpp.put(ch, mpp.getOrDefault(ch, 0) + 1);
        }
        for (int count : mpp.values()) {
            if (count == 0) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean ans = checkPangram(sentence);
        System.out.println(ans);
    }
}
