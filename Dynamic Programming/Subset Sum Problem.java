class Solution{
    static Boolean isSubsetSum(int n, int arr[], int sum){
      
      boolean t[][] = new boolean[n+1][sum+1];
        
       //initilization true and false
        for(int i = 0; i<sum+1; i++)
        {
          t[0][i] = false;
        }
        
        for(int i = 0; i<n+1; i++)
        {
          t[i][0] = true;
        }

        
        for(int i = 1; i<n+1; i++)
        {
            for(int j = 1; j<sum+1; j++)
            {
                if(arr[i-1] <= j)
                {
                    t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j];
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        
        return t[n][sum];
    }
}
