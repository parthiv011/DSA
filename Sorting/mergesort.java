// Merge Sort

class mergesort {
    public static void sort(int arr[], int s, int e) {
        if (s >= e) {
            return;
        }
        int mid = s + (e - s) / 2;
        sort(arr, s, mid);
        sort(arr, mid + 1, e);
        merge(arr, s, e);
    }

    public static void merge(int arr[], int s, int e) {
        int mid = s + (e - s) / 2;

        int len1 = mid - s + 1;
        int len2 = e - mid;

        int first[] = new int[len1];
        int second[] = new int[len2];

        int mainArrayIndex = s;

        // copy the elements in first array
        for (int i = 0; i < len1; i++) {
            first[i] = arr[mainArrayIndex++];
        }

        // copy the elements in second array
        mainArrayIndex = mid + 1;
        for (int i = 0; i < len2; i++) {
            second[i] = arr[mainArrayIndex++];
        }

        mainArrayIndex = s;
        int idx1 = 0, idx2 = 0;
        while (idx1 < len1 && idx2 < len2) {
            if (first[idx1] < second[idx2]) {
                arr[mainArrayIndex++] = first[idx1++];
            } else {
                arr[mainArrayIndex++] = second[idx2++];
            }
        }
        while (idx1 < len1) {
            arr[mainArrayIndex++] = first[idx1++];
        }
        while (idx2 < len2) {
            arr[mainArrayIndex++] = second[idx2++];
        }

    }

    public static void main(String[] args) {
        int arr[] = { 10, 7, 3, 44, 23, 1, -4, -3 };
        System.out.println("Before sorting:");
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sort(arr, 0, arr.length - 1);
        System.out.println("After sorting:");
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}