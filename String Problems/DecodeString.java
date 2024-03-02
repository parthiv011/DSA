import java.util.HashMap;

public class DecodeString {
    private static String decode(String key, String msg) {
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Character> mpp = new HashMap<>();

        String letters = "abcdefghijklmnopqrstuvwxyz";
        int index = 0;

        for (int i = 0; i < key.length(); i++) {
            if (!mpp.containsKey(key.charAt(i)) && key.charAt(i) != ' ') {
                mpp.put(key.charAt(i), letters.charAt(index));
                index++;
            }
        }

        for (int i = 0; i < msg.length(); i++) {
            if (mpp.containsKey(msg.charAt(i))) {
                sb.append(mpp.get(msg.charAt(i)));
            }
            if (msg.charAt(i) == ' ') {
                sb.append(" ");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog";
        String msg = "vkbs bs t suepuv";

        String ans = decode(key, msg);
        System.out.println("Decoded: " + ans);
    }
}
