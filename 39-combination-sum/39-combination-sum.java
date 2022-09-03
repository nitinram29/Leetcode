class Solution {
    
    public void helper(int in,int target,int[] arr,List<List<Integer>> ans,List<Integer> ds){
        
        
        if(in==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        
        if(arr[in]<=target){
            
            ds.add(arr[in]);
            helper(in,target-arr[in],arr,ans,ds);
            ds.remove(ds.size()-1);
            
        }
        helper(in+1,target,arr,ans,ds);
    }
    
    
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> ans = new ArrayList<>();
        helper(0,target,candidates,ans,new ArrayList<Integer>());
        return ans;
        
        
    }
}