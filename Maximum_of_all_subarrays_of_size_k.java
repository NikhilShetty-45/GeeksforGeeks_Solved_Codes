class Solution
{
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int j =0;j<=n-k;j++)
        {
            int max=arr[j];
            for(int i=1;i<=k;i++)
            {
                if(arr[j+i-1]>max)
                {
                    max=arr[j+i-1];
                }
            }
            list.add(max);
            
        }
        return list;        
    }
}
