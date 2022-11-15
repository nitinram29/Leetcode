class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Set<Integer>listS = new HashSet<>();        
        for(int i: nums) listS.add(i);
        
        
        
        
        
        int ans=0;
        for(int i: listS){
            if(!listS.contains(i-1)){
                int tmp = i;
                int t=1;
                while(listS.contains(tmp+1)){
                    t+=1;
                    tmp+=1;
                }
                ans = Math.max(t,ans);   
            }
        }
        return ans;
    }
}