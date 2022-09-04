class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==1) return nums[0];
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i:nums)
            map.put(i,map.getOrDefault(i,0)+1);
        for(Map.Entry<Integer,Integer> i: map.entrySet())
            if(i.getValue()==1) return i.getKey();
        
        return 0;        
    }
}