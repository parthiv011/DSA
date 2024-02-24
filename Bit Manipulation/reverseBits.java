public class reverseBits {
    private static int ReverseBits(int n){
        int result = 0;

        // Iterate until n becomes 0
        while (n != 0){
            // Shift result to the left to make space for the next bit
            result <<= 1;
            // Add the least significant bit of n to result
            result |= n & 1;
            // Right shift n to check the next bit
            n >>>= 1;
        }
        return result;
    }

    public static void main(String[] args){
        int n = 0b10100; // Binary representation of 20
        int ans = ReverseBits(n);
        System.out.println(ans); // Output should be the binary representation of 20 in reverse
    }
}
