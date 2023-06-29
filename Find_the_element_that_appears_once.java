class Sol
{
    public static int search(int A[], int N)
    {
        for(int i=0; i<N-1; i++)
        {
            if(i%2==0)
            {
                if(A[i]!=A[i+1])
                {
                    return A[i];
                }
            }
        }
        return A[N-1];
    }
}
