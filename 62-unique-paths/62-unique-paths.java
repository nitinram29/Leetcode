class Solution {
    
    
    public int helper(int i,int j,int m,int n,int[][] dp){
        
        if(i==m-1 && j==n-1){
            return 1;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        int y = 0;
        if(i+1<m) y=helper(i+1,j,m,n,dp);
        int x = 0;
        if(j+1<n) x=helper(i,j+1,m,n,dp);
        return dp[i][j]=x+y;     
    }
    
    
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int[] i:dp)
        Arrays.fill(i,-1);
        
        return helper(0,0,m,n,dp);
        
    }
}