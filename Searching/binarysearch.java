class binarysearch {
    public static int search(int arr[], int s, int e, int key) {
        int mid = s + (e - s) / 2;
        while (s <= e) {
            if (arr[mid] == key) {
                return mid;
            }
            if (key > arr[mid]) {
                s = mid + 1;
            }
            if (key < arr[mid]) {
                e = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 9, 11, 23, 25 };
        int key = 11;
        int ans = search(arr, 0, arr.length, key);
        System.out.println("Element is found at : " + ans);
    }
}
