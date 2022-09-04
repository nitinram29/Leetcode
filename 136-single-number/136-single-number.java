class Solution {
    public int singleNumber(int[] nums) {        
        if(nums.length==1) return nums[0];
        
        // as XOR of 2 same numbers is 0
        // eg. 2,1,2 so 2^2 results in 0 so the ans will contain only 1
        int ans=0;
        for(int i:nums)
            ans^=i;
        return ans; 
    }
}