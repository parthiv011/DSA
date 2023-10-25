// Dutch National Flag Algorithm 

class DNFAlgorithm {
    private static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void sort(int arr[], int n) {
        int low = 0, mid = 0, high = n - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, mid, low);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 1, 1, 0, 0, 0, 1, 2, 2, 1, 0, 0 };
        sort(arr, arr.length);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}