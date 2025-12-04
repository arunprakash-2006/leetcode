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
    int sum=0;
    
    public int sumOfLeftLeaves(TreeNode root) {
        help(root,null);
        return sum;
   
    }

    public void help(TreeNode root,TreeNode parent)
    {
        if(root==null) return;
        if(root.left==null && root.right==null)
        {
            if(parent!=null && parent.left==root)
            {
                sum+=root.val;
            }
        }

        help(root.left,root);
        help(root.right,root);
    }
}