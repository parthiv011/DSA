import java.util.*;

public class KBaseProblem {

    private static ArrayList<Integer> reverse(ArrayList<Integer> arr) {
        int n = arr.size();
        int i = 0, j = n - 1;
        while (i < j) {
            Integer temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
            i++;
            j--;
        }
        return arr;
    }

    private static ArrayList<Integer> convert(int number, int base) {
        ArrayList<Integer> ans = new ArrayList<>();

        while (number != 0) {
            ans.add(number % base);
            number /= base;
        }

        return reverse(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        System.out.println("Enter base : ");
        int base = sc.nextInt();
        ArrayList<Integer> ans = convert(number, base);
        System.out.println(ans);
    }

}
