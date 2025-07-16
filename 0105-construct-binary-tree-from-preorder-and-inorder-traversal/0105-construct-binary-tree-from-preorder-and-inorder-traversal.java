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
    int pind=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder,inorder,0,preorder.length-1);
    }
    public TreeNode helper (int [] preorder,int [] inorder,int s,int e)
    {
        if(s>e) return null;
        int ind=-1;
        int val=preorder[pind++];
        TreeNode root=new TreeNode(val);
        for(int i=s;i<=e;i++)
        {
            if(inorder[i]==val)
            {
                ind=i;
            }
        }
        root.left=helper(preorder,inorder,s,ind-1);
        root.right=helper(preorder,inorder,ind+1,e);
        return root;


    }
        
    
}