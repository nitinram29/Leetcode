class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<nums.length-1;i++){
            int j=i+1;
            int z=nums.length-1;
            while(j<z){
                int tmp = nums[i] + nums[j] + nums[z];
                if (Math.abs(target - ans) > Math.abs(target - tmp)) {
                    ans = tmp;
                }
                if (tmp < target) {
                    j++;
                }
                else {
                    z--;
                }
            }
        }
        return ans;
    }
}