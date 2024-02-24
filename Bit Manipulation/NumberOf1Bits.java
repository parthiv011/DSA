public class NumberOf1Bits {
    private static int hammingWeight(int n){
        int cnt = 0;

        while(n != 0){
            if(n < 0){
                cnt++;
            }
            n <<= 1;
        }
        return cnt;
    }
    public static void main(String[] args){
        int n = 00010101;
        int ans = hammingWeight(n);
        System.out.println(ans);
    }
}
