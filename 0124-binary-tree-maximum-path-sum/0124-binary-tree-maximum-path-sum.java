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
    int max_height=-1001;

    public int helper(TreeNode root)
    {
        if(root==null) return 0;
        int leftsum=Math.max(0,helper(root.left));
        int rightsum=Math.max(0,helper(root.right));
        max_height=Math.max(max_height,(leftsum+rightsum+root.val));
        return Math.max(leftsum,rightsum)+root.val;
    }
    public int maxPathSum(TreeNode root) {
        
        helper(root);
        return max_height;
    }
}