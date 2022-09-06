class Solution {
    
    public void helper(int in,int target,int[] arr,List<List<Integer>> ans,List<Integer> ds){
        if(target==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=in;i<arr.length;i++){
            if(i!=in && arr[i]==arr[i-1]) continue;
            if(arr[i]<=target){
                ds.add(arr[i]);
                helper(i+1,target-arr[i],arr,ans,ds);
                ds.remove(ds.size()-1);
            }   
        }   
    }        
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        helper(0,target,candidates,ans,new ArrayList<>());
        return ans;
    }
}