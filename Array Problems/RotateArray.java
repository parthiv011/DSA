import java.util.Scanner;

public class RotateArray {
    private static void rotate(int arr[], int n, int k) {
        int temp[] = new int[k];

        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }

        for (int i = n - k; i < n; i++) {
            arr[i] = temp[i - (n - k)];
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        rotate(arr, n, k);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
