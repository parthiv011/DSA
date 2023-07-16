class linearsearch {
    public static int search(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 9, 11, 23, 25 };
        int key = 11;
        int ans = search(arr, key);
        System.out.println("Element is found at : " + ans);
    }
}