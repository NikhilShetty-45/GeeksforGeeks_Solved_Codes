
class Solution 
{
    public static long[] productExceptSelf(int nums[]) 
    {
        int n = nums.length,zeroCount = 0, index = -1, i;
        long sum = 1;
        long[] result = new long[n];
        for(i =0; i<n ; i++)
        {
            if(nums[i] == 0)
            {
                index = i;
                zeroCount++;
            }
            else
            {
                sum = sum * nums[i];
            }
        }
        if(zeroCount > 1)
        {
            return result;
        }
        else if(zeroCount == 1)
        {
            result[index] = sum ;
        }
        else
        {
            for(i =0; i<n; i++)
            {
                result[i] = sum/nums[i];
            }
            
        }
        return result;
    }
}
