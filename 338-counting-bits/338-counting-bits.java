class Solution {
    
    public int helper(int i){
        int count=0;
        while(i>0){
            count+=i&1;
            i>>>=1;            
        }
        return count;
    }
    
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i=0;i<=n;i++)
            ans[i] = helper(i);
        return ans;
    }
}