class Solution {
    
    public int helper(String blocks,int ind,int k){
        int count=0;
        for(int i=ind;i<k+ind;i++){
            if(blocks.charAt(i)=='W') count++;
        }
        return count;
    }
    
    public int minimumRecolors(String blocks, int k) {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<=blocks.length()-k;i++){
            ans = Math.min(ans,helper(blocks,i,k));
        }
        return ans;
    }
}