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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode cur=root;
        TreeNode newnode=new TreeNode(val);
         if(root==null) return newnode;
        
        while(cur!=null)
        {
            if(cur.val<val)
            {
                if(cur.right==null)
                {
                    cur.right=newnode;
                    break;
                    
                }
                else
                {
                    cur=cur.right;
                }
            }

            else
            {
                if(cur.left==null)
                {
                    cur.left=newnode;
                    break;
                }
                else
                {
                    cur=cur.left;
                }

            }
        }
        return root;
        
    }
}