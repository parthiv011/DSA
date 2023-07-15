public class quicksort {
    public static void qsort(int arr[], int s, int e) {
        if (s >= e) {
            return;
        }
        int p = partition(arr, s, e);
        qsort(arr, s, p - 1);
        qsort(arr, p + 1, e);
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int arr[], int s, int e) {
        int pivot = arr[s];
        int cnt = 0;
        for (int i = s + 1; i < arr.length; i++) {
            if (pivot > arr[i]) {
                cnt++;
            }
        }
        int pivotIndex = s + cnt;
        swap(arr, s, pivotIndex);
        int i = s, j = e;
        while (i < pivotIndex && j > pivotIndex) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i < pivotIndex && j > pivotIndex) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIndex;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 7, 3, 44, 23, 1, -4, -3 };
        System.out.println("Before sorting:");
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        qsort(arr, 0, arr.length - 1);
        System.out.println("After sorting:");
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
