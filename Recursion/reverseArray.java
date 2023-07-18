// Two pointer method in recursion 
public class reverseArray {
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int arr[], int s, int e) {

        if (s >= e) {
            return;
        }
        swap(arr, s, e);
        reverse(arr, s + 1, e - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 3, 2, 1 };
        System.out.println("Original Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();

        reverse(arr, 0, arr.length - 1);
        System.out.println("Reverse array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
