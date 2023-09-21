//Sliding window approach

import java.util.HashMap;

public class countDistinctWindows {
    private static void countDistinct(int arr[], int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        // iterate and store the count of every element
        for (int i = 0; i < k; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(mp.size());

        for (int i = k; i < arr.length; i++) {
            if (mp.get(arr[i - k]) == 1) {
                mp.remove(arr[i - k]);
            } else {
                mp.put(arr[i - k], mp.get(arr[i - k]) - 1);
            }

            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
            System.out.println(mp.size());
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 2, 2, 2 };
        int k = 4;

        countDistinct(arr, k);
    }
}
