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
    
    public String helper(TreeNode root,String ans){
        if(root==null) return "";
        if(root.left==null && root.right==null) return root.val+"";
        if(root.right==null) return root.val+"("+ helper(root.left,ans)+")";
        return root.val+"("+helper(root.left,ans)+")("+helper(root.right,ans)+")";
    }
    
    public String tree2str(TreeNode root) {
        return helper(root,"");   
    }
}