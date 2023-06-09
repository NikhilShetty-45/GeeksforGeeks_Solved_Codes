
class Solution {
    public static long countBits(long N) {
        int c = 0;
        while(N>0)
        {
            c += Long.bitCount(N);
            N--;
        }
        return c;
    }
}
        
