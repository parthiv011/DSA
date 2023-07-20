public class SearchInRotatedArray {
    private static int getPivot(int arr[], int n) {
        int s = 0;
        int e = arr.length - 1;
        int mid = s + (e - s) / 2;

        while (s < e) {
            if (arr[mid] >= arr[0])
                s = mid + 1;

            else
                e = mid;

            mid = s + (e - s) / 2;
        }
        return s;
    }

    private static int binarysearch(int arr[], int s, int e, int key) {
        int mid = s + (e - s) / 2;
        while (s <= e) {
            if (arr[mid] == key)
                return mid;

            if (key > arr[mid])
                s = mid + 1;
            else
                e = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 4, 5, 6, 7, 0, 1, 2 };
        int pivot = getPivot(arr, 7);
        System.out.println("Pivot index is : " + pivot);
        int target = 5;
        int ans;
        if (target >= arr[pivot] && target <= arr[arr.length - 1]) {
            ans = binarysearch(arr, pivot, arr.length - 1, target);
        } else {
            ans = binarysearch(arr, 0, pivot - 1, target);
        }
        System.out.println("The target element is at : " + ans);
    }
}
