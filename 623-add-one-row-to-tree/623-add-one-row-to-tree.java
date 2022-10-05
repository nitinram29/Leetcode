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
    public void helper(TreeNode root,int val,int cur,int dep){
        System.out.println(dep);
        if(cur==dep){
            System.out.println(root.val+" "+cur+" "+dep);
            TreeNode tmp = root.left;
            root.left = new TreeNode(val);
            root.left.left = tmp;
            tmp = root.right;
            root.right = new TreeNode(val);
            root.right.right = tmp;
            return;
        }
        if(root.left!=null)
            helper(root.left,val,cur+1,dep);
        if(root.right!=null)
            helper(root.right,val,cur+1,dep);
    }
    
    
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode tmp = new TreeNode(val);
            tmp.left = root;
            root = tmp;
        }else helper(root,val,1,depth-1);
        return root;
    }
}