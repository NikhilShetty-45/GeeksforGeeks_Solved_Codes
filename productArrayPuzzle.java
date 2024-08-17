//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }
            Solution ob = new Solution();
            long[] ans = new long[n];
            ans = ob.productExceptSelf(array);

            for (int i = 0; i < n; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
            t--;
        }
    }
}

// } Driver Code Ends


// User function Template for Java

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
