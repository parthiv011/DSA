import java.util.HashMap;

public class fruitsInABasket {
    private static int totalFruit(int[] fruits) {
        int maxlen = 0;
        int l = 0, r = 0;
        int n = fruits.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (r < n) {
            if (!map.containsKey(fruits[r])) {
                map.put(fruits[r], 1);
                while (map.size() > 2) {
                    int occ = map.get(fruits[l]);
                    if (occ == 1) {
                        map.remove(fruits[l]);
                    } else {
                        map.put(fruits[l], occ - 1);
                    }
                    l++;
                }
            } else {
                map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);
            }
            maxlen = Math.max(maxlen, r - l + 1);
            r++;
        }
        return maxlen;
    }

    public static void main(String[] args) {
        int fruits[] = { 1, 2, 3, 2, 2 };
        int ans = totalFruit(fruits);
        System.out.println(ans);
    }
}