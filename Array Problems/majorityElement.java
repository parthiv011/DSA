import java.util.HashMap;
import java.util.Map;

public class majorityElement {
    // Applying Moore's Voting algorithm
    private static int majority(int arr[], int n) {
        int cnt = 0;
        int el = 0;

        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = arr[i];
            } else if (arr[i] == el)
                cnt++;
            else
                cnt--;
        }

        int elCnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == el)
                elCnt++;
        }
        if (elCnt > n / 2)
            return el;
        return -1;
    }

    // Hashing Technique
    // private static int majority(int arr[], int n) {
    // HashMap<Integer, Integer> mp = new HashMap<>();

    // for (int i = 0; i < n; i++) {
    // int value = mp.getOrDefault(arr[i], 0);
    // mp.put(arr[i], value + 1);
    // }

    // for (Map.Entry<Integer, Integer> it : mp.entrySet()) {
    // if (it.getValue() > (n / 2)) {
    // return it.getKey();
    // }
    // }
    // return -1;
    // }

    public static void main(String[] args) {
        int arr[] = { 2, 0, 1, 1, 1, 2, 2 };
        int ans = majority(arr, arr.length);
        System.out.println(ans);
    }
}
