/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        List<Double> list = new ArrayList<>();
        
        while(!q.isEmpty()){
            int t=q.size();
            double sum=0;
            int m=t;
            while(t!=0){
                TreeNode n = q.poll();
                sum+=(n.val*1.0);
                if(n.left!=null) q.add(n.left);
                if(n.right!=null) q.add(n.right);
                t--;
            }
            list.add((sum)/m);
            
        }
        return list;
        
    }
}