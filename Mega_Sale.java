class Compute {

    public static long maxProfit(int a[], int n, int m) {
        long sum =0;
        Arrays.sort(a);
        for(int i=0; i<n; i++)
        {
            if(a[i]<0 && m>0)
            {
                sum = sum + (-1)*a[i];
                m--;
            }
        }
        return sum;
    }
}
