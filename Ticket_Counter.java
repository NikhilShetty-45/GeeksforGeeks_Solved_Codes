class Solution {
    public static int distributeTicket(int N,int K)
    {
        int I=0;
        int J=N+1;
        while(true)
        {
            for(int i =1;i<=K;i++)
            {
                I++;
                if(I+1==J)
                {
                    return I;
                }
            }
            for(int j=1;j<=K;j++)
            {
                J--;
                if(J-1==I)
                {
                    return J;
                }
            }
        }
    }
} 
