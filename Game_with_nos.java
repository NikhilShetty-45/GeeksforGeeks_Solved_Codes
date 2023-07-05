class Complete{
    public static int[] game_with_number (int arr[], int n) 
    {
        int[] temp= new int[n];
        for(int i=0; i<n-1; i++)
        {
            temp[i]=arr[i]^arr[i+1];
        }
        temp[n-1]= arr[n-1];
        return temp;
    }  
}
