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
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int l=height(root.left);
        int r=height(root.right);
        if(Math.abs(l-r)>1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
        
    }
    public int height(TreeNode n)
    {
        if(n==null) return 0;
        int left=height(n.left);
        int right=height(n.right);
        return Math.max(left,right)+1;
    }
}