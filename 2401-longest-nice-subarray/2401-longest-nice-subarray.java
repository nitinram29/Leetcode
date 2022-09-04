class Solution {
    public int longestNiceSubarray(int[] nums) {
        if(nums.length==1) return 1;
        int ans=1;        
        int i=0;
        int j=1;
        while(j<nums.length){
            int tmp1 = i;
            while(tmp1<j){
                int tmp = tmp1+1;
                while(tmp<=j){
                    if((nums[tmp1] & nums[tmp]) != 0) {
                    break;
                    }
                    
                    tmp++;
                }
                if(tmp<=j) break;
                tmp1++;
            }
           
            if(tmp1>=j){
                ans = Math.max(ans,j-i+1);
            }else{
                i++;
            }
            j++;
        }
        return ans;   
    }
}