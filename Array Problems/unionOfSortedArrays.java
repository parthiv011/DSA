import java.util.ArrayList;
import java.util.List;

public class unionOfSortedArrays {
    public static List<Integer> sortedArray(int[] a, int[] b) {
        List<Integer> unionArr = new ArrayList<>();

        int n1 = a.length;
        int n2 = b.length;

        int i = 0;
        int j = 0;

        while (i < n1 && j < n2) {
            if (a[i] <= b[j]) {
                if (!unionArr.contains(a[i])) {
                    unionArr.add(a[i]);
                }
                i++;
            } else {
                if (!unionArr.contains(b[j])) {
                    unionArr.add(b[j]);
                }
                j++;
            }
        }
        while (i < n1) {
            if (!unionArr.contains(a[i])) {
                unionArr.add(a[i]);
            }
            i++;
        }
        while (j < n2) {
            if (!unionArr.contains(b[j])) {
                unionArr.add(b[j]);
            }
            j++;
        }
        return unionArr;
    }

    public static void main(String[] args) {
        int arr1[] = new int[] { 1, 2, 3, 4 };
        int arr2[] = new int[] { 2, 4, 5, 6, 7, 8 };
        List<Integer> ans = sortedArray(arr1, arr2);
        System.out.println(ans);

    }
}