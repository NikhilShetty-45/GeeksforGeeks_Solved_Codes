class Solution
{
    static int majorityElement(int a[], int size)
    {
        int count=0;
        Arrays.sort(a);
        for(int i=0; i<a.length; i++)
        {
            if(a[i] == a[size/2])
            {
                count++;
            }
            if(count>(size/2))
            {
                return a[size/2];
            }
        }
        return -1;
    }
}
