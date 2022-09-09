class Solution {
    public int helper(int[] arr,int ind,int[] dp){
        if(ind>=arr.length){
            return 0;
        }
        if(dp[ind]!=-1) return dp[ind];
        int x = helper(arr,ind+1,dp)+arr[ind];
        int y = helper(arr,ind+2,dp)+arr[ind];
        return dp[ind] = Math.min(x,y);
    }
    
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        Arrays.fill(dp,-1);      
        return Math.min(helper(cost,0,dp),helper(cost,1,dp));
    }
}