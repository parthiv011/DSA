//the condition for performing binary search is that is should have sorted array

//this is binary search implementation using recursion

class binarysearch {
    public static int search(int arr[], int s, int e, int key) {
        s = 0;
        e = arr.length;
        int mid = s + (e - s) / 2;
        if (arr[mid] == key) {
            return mid;
        }
        while (arr[mid] < key) {
            search(arr, 0, mid - 1, key);
        }
        while (arr[mid] > key) {
            search(arr, mid + 1, e, key);
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