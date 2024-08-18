
class Solution {
    public boolean canSplit(int arr[]) 
    {
        int sum = 0, temp =0, n = arr.length;
        for(int i =0; i<n; i++)
        {
            sum = sum  + arr[i];
        }
        if (sum%2!=0)
        {
            return false;
        }
        sum = sum /2;
        temp = sum;
        for(int i = 0; i<n ; i++)
        {
            if(temp-arr[i]>0)
            {
                temp = temp - arr[i];
            }
            else if(temp-arr[i] == 0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        return false;
    }
    
}
