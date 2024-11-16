public class PairsDivisiblebyK {

    public static class Pair {
        int first, second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public String toString() {
            return "(" + first + ", " + second + ")";
        }
    }

    public static void main(String[] args) {
        // Initialize and assign values to the pairs
        int arr[] = { 1, 2, 3, 4, 5, 10, 6, 7, 8, 9 };
        int k = 5;
        Pair p[] = new Pair[arr.length / 2];
        int j = arr.length;
        for (int i = 1; i < arr.length; i++) {
            p[i / 2] = new Pair(arr[i - 1], arr[i]);
        }
        for (Pair pair : p) {
            System.out.println(pair);
        }
    }
}
