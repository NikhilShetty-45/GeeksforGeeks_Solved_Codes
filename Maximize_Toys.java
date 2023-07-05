class Solution{
    static int toyCount(int N, int K, int arr[])
    {
        Arrays.sort(arr);
        int i =0,count=0;
        while(i<N)
        {
            if((K-arr[i])>=0)
            {
                count++;
                K= K- arr[i];
            }
            i++;
        }
        return count;    
    }
}
