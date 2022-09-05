/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        
        
        
        Queue<Node> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        List<Integer> l = new ArrayList<>();
        l.add(root.val);
        ans.add(l);
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            l = new ArrayList<>();
            while(n!=0){
                for(Node i:q.poll().children){
                    l.add(i.val);   
                    q.add(i);
                }
                n--;
            }
            if(l.size()!=0)
            ans.add(l);            
        }
        return ans;        
    }
}