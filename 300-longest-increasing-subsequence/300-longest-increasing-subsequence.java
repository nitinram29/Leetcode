class Solution {
    
    public int helper(int[] nums,int ind,int[] dp){  
        if(dp[ind]!=-1) return dp[ind];
        int ans=0;
        for(int i=ind+1;i<nums.length;i++){
            if(nums[i]>nums[ind]){
                ans= Math.max(ans,(helper(nums,i,dp)+1));
            }
        }
        return dp[ind] = ans;
    }
    
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans = Math.max(ans,helper(nums,i,dp));
        }
        return ans+1;   
    }
}