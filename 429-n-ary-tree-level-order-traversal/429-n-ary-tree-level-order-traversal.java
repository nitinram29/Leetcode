class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            List<Integer> l = new ArrayList<>();
            while(n!=0){
                l.add(q.peek().val);
                for(Node i:q.poll().children){
                    q.add(i);
                }
                n--;
            }
            ans.add(l);            
        }
        return ans;        
    }
}