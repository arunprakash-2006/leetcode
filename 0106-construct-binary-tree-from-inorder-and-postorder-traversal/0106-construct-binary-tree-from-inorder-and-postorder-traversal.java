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
    int pind;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        pind=postorder.length-1;
        return helper(postorder,inorder,0,inorder.length-1);
    }
    public TreeNode helper (int [] postorder,int [] inorder,int s,int e)
    {
        if (s > e)return null;
        
        int val=postorder[pind--];
        TreeNode root=new TreeNode(val);
        int ind=-1;
        for(int i=s;i<=e;i++)
        {
            if(inorder[i]==val)
            {
                ind=i;
                break;
                
            }
        }
       root.right = helper(postorder, inorder, ind + 1, e);
        root.left = helper(postorder, inorder, s, ind - 1);

        return root;
    }
        
}