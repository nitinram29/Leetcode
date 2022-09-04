class Solution {
    public int missingNumber(int[] nums) {
        
        int sum = (nums.length*(nums.length+1))/2;
        int tmp=0;
        for(int i:nums) tmp+=i;
        return sum-tmp;
    }
}